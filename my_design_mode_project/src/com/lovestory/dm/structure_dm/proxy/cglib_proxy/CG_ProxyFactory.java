package com.lovestory.dm.structure_dm.proxy.cglib_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CG_ProxyFactory implements MethodInterceptor {

	// ά��һ��Ŀ�����
	private Object target;

	// ����������target���г�ʼ��
	public CG_ProxyFactory(Object target) {
		this.target = target;
	}

	// ��Ŀ���������һ���������
	public Object getProxyInstance() {
		// 1. ����һ��������
		Enhancer enhancer = new Enhancer();

		// 2. ���ø���
		enhancer.setSuperclass(target.getClass());

		// 3. ���ûص�����
		enhancer.setCallback(this);

		// 4. ����������󣬼��������
		return enhancer.create();
	}

	// ��дintercept������ʵ�ֶԱ��������ķ����ĵ���
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("cglib����ʼ������");
		Object invoke = method.invoke(target, args);
		System.out.println("cglib�������������");
		return invoke;
	}
}
