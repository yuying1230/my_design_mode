package com.lovestory.dm.structure_dm.proxy.cglib_proxy;

public class CG_Client {

	public static void main(String[] args) {
		// 创建目标对象
		CG_TeacherDao target = new CG_TeacherDao();
		// 创建代理对象
		CG_TeacherDao proxyInstance =(CG_TeacherDao) new CG_ProxyFactory(target).getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		// 执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用。
		proxyInstance.teach();
	}

}
