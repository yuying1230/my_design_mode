package com.lovestory.dm.principle.single_responsibility;

public class SR2_SingleResponsibility {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("汽车");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("轮船");
	}

}

// 遵循单一职责原则
// 但是该方式将类进行了分解，同时也需要修改客户端（main方法），改动很大
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在路上运行...");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在天上运行...");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在水上运行...");
	}
}