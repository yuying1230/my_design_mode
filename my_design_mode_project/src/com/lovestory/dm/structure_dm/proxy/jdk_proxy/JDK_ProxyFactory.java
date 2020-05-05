package com.lovestory.dm.structure_dm.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK_ProxyFactory {

	// 维护一个目标对象
	private Object target;

	// 構造器，對target進行初始化
	public JDK_ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成一个代理对象
	public Object getProxyInstance() {
		// 说明
		// 方法： public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces, InvocationHandler h)
		// loader： 指定当前目标对象使用的类加载器，获取加载器方法，固定的
		// interfaces：目标对象实现的接口类型，使用泛型方式确认类型
		// h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，把当前执行的目标对象的方法作为参数传入
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK代理开始。。。");
						// 反射机制调用目标对象的方法
						Object retVal = method.invoke(target, args);
						return retVal;
					}
				});
	}
}
