package com.lovestory.dm.structure_dm.proxy.jdk_proxy;

public class JDK_Client {

	public static void main(String[] args) {
		// ����Ŀ�����
		JDK_ITeacherDao target = new JDK_TeacherDao();
		// �����������
		JDK_ITeacherDao proxyInstance =(JDK_ITeacherDao) new JDK_ProxyFactory(target).getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		proxyInstance.teach();
	}

}
