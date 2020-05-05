package com.lovestory.dm.structure_dm.proxy.static_proxy;

// 静态代理
public class SP_TeacherDaoProxy implements SP_ITeacherDao {
	private SP_ITeacherDao target;  // 目标对象，通过接口聚合
	
	public SP_TeacherDaoProxy(SP_ITeacherDao target) {
		super();
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("代理开始。。。");
		this.target.teach();
		System.out.println("代理结束。。。");
	}

}
