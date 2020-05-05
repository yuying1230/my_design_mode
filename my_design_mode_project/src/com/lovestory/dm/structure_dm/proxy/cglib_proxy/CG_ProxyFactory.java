package com.lovestory.dm.structure_dm.proxy.cglib_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CG_ProxyFactory implements MethodInterceptor {

	// 维护一个目标对象
	private Object target;

	// 构造器，对target进行初始化
	public CG_ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成一个代理对象
	public Object getProxyInstance() {
		// 1. 创建一个工具类
		Enhancer enhancer = new Enhancer();

		// 2. 设置父类
		enhancer.setSuperclass(target.getClass());

		// 3. 设置回调函数
		enhancer.setCallback(this);

		// 4. 创建子类对象，即代理对象
		return enhancer.create();
	}

	// 重写intercept方法，实现对被代理对象的方法的调用
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("cglib代理开始。。。");
		Object invoke = method.invoke(target, args);
		System.out.println("cglib代理结束。。。");
		return invoke;
	}
}
