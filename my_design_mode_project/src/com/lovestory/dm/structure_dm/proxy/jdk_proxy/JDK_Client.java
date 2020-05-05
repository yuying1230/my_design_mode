package com.lovestory.dm.structure_dm.proxy.jdk_proxy;

public class JDK_Client {

	public static void main(String[] args) {
		// 创建目标对象
		JDK_ITeacherDao target = new JDK_TeacherDao();
		// 创建代理对象
		JDK_ITeacherDao proxyInstance =(JDK_ITeacherDao) new JDK_ProxyFactory(target).getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		proxyInstance.teach();
	}

}
