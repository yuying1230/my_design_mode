package com.lovestory.dm.structure_dm.proxy.static_proxy;

public class SP_Client {

	public static void main(String[] args) {
		// 创建目标对象
		SP_ITeacherDao target = new SP_TeacherDao();
		// 创建代理对象，将被代理对象传递给代理对象
		SP_TeacherDaoProxy proxy = new SP_TeacherDaoProxy(target);
		// 通过代理对象，调用到被代理对象的方法
		// 执行的是代理对象的方法，代理对象再去调用目标对象的方法
		proxy.teach();
	}

}
