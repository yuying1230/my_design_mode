package com.lovestory.dm.principle.single_responsibility;

public class SR3_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.runRoad("����");
		vehicle2.runWater("�ִ�");
		vehicle2.runAir("�ɻ�");
	}

}
// �÷�ʽû�ж�ԭ����������޸ģ�ֻ�������˷���
// ��Ȼû������ļ��������ص�һְ��ԭ�򣬵����ڷ��������ϣ������˵�һְ��ԭ��
class Vehicle2 {
	public void runRoad(String vehicle) {
		System.out.println(vehicle + " �ڹ�·��ʻ...");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + " ��ˮ�Ϻ���...");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + " �����Ϸ���...");
	}
}
