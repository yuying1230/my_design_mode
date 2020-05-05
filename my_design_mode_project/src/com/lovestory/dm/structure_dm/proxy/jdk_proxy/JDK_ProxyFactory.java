package com.lovestory.dm.structure_dm.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK_ProxyFactory {

	// ά��һ��Ŀ�����
	private Object target;

	// ����������target�M�г�ʼ��
	public JDK_ProxyFactory(Object target) {
		this.target = target;
	}

	// ��Ŀ���������һ���������
	public Object getProxyInstance() {
		// ˵��
		// ������ public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces, InvocationHandler h)
		// loader�� ָ����ǰĿ�����ʹ�õ������������ȡ�������������̶���
		// interfaces��Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��ͷ�ʽȷ������
		// h���¼�����ִ��Ŀ�����ķ���ʱ���ᴥ���¼��������ķ������ѵ�ǰִ�е�Ŀ�����ķ�����Ϊ��������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK����ʼ������");
						// ������Ƶ���Ŀ�����ķ���
						Object retVal = method.invoke(target, args);
						return retVal;
					}
				});
	}
}
