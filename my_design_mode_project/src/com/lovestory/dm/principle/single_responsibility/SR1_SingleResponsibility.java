package com.lovestory.dm.principle.single_responsibility;

public class SR1_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("����");
		vehicle.run("�ִ�");
		vehicle.run("�ɻ�");
	}

}

// Vehicle���run����ϣ�����ֳ�ÿ�ֽ�ͨ���ߵ��˶���ʽ
// ���Ž�ͨ�����������ӻ����޸ģ��п�����Ҫ�������޸����˶���ʽ��ֱ����Vehicle�����޸Ļ����һЩ����
// �������������ĸ��Ӷȣ��ɶ��Բ��ߣ�Ŀ���Բ����ԣ�Υ���˵�һԭ��
class Vehicle {
	public void run(String vehicle) {
		if ("����".equals(vehicle)) {
			System.out.println(vehicle + " �ڹ�·��ʻ...");
		} else if ("�ִ�".equals(vehicle)) {
			System.out.println(vehicle + " ��ˮ�Ϻ���...");
		} else if ("�ɻ�".equals(vehicle)) {
			System.out.println(vehicle + " �����Ϸ���...");
		} else {
			System.out.println("nothing...");
		}
		
	}
}
