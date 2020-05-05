package com.lovestory.dm.structure_dm.proxy.static_proxy;

// ��̬����
public class SP_TeacherDaoProxy implements SP_ITeacherDao {
	private SP_ITeacherDao target;  // Ŀ�����ͨ���ӿھۺ�
	
	public SP_TeacherDaoProxy(SP_ITeacherDao target) {
		super();
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("����ʼ������");
		this.target.teach();
		System.out.println("�������������");
	}

}
