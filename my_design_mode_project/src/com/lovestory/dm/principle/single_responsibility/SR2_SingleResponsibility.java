package com.lovestory.dm.principle.single_responsibility;

public class SR2_SingleResponsibility {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("����");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("�ɻ�");
		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("�ִ�");
	}

}

// ��ѭ��һְ��ԭ��
// ���Ǹ÷�ʽ��������˷ֽ⣬ͬʱҲ��Ҫ�޸Ŀͻ��ˣ�main���������Ķ��ܴ�
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " ��·������...");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " ����������...");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " ��ˮ������...");
	}
}