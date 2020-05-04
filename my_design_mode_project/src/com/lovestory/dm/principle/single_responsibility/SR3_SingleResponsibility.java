package com.lovestory.dm.principle.single_responsibility;

public class SR3_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.runRoad("汽车");
		vehicle2.runWater("轮船");
		vehicle2.runAir("飞机");
	}

}
// 该方式没有对原有类做大的修改，只是增加了方法
// 虽然没有在类的级别上遵守单一职责原则，但是在方法级别上，遵守了单一职责原则
class Vehicle2 {
	public void runRoad(String vehicle) {
		System.out.println(vehicle + " 在公路行驶...");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水上航行...");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天上飞行...");
	}
}
