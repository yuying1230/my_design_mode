package com.lovestory.dm.structure_dm.proxy.cglib_proxy;

public class CG_Client {

	public static void main(String[] args) {
		// ����Ŀ�����
		CG_TeacherDao target = new CG_TeacherDao();
		// �����������
		CG_TeacherDao proxyInstance =(CG_TeacherDao) new CG_ProxyFactory(target).getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		// ִ�д������ķ���������intercept�������Ӷ�ʵ�ֶ�Ŀ�����ĵ��á�
		proxyInstance.teach();
	}

}
