package com.lovestory.dm.structure_dm.proxy.static_proxy;

public class SP_Client {

	public static void main(String[] args) {
		// ����Ŀ�����
		SP_ITeacherDao target = new SP_TeacherDao();
		// ����������󣬽���������󴫵ݸ��������
		SP_TeacherDaoProxy proxy = new SP_TeacherDaoProxy(target);
		// ͨ��������󣬵��õ����������ķ���
		// ִ�е��Ǵ������ķ��������������ȥ����Ŀ�����ķ���
		proxy.teach();
	}

}
