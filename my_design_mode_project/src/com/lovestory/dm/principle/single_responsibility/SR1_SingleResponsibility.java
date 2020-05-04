package com.lovestory.dm.principle.single_responsibility;

public class SR1_SingleResponsibility {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("汽车");
		vehicle.run("轮船");
		vehicle.run("飞机");
	}

}

// Vehicle类的run方法希望表现出每种交通工具的运动方式
// 随着交通工具种类增加或者修改，有可能需要新增或修改其运动方式，直接在Vehicle类中修改会带来一些风险
// 该情况增加了类的复杂度，可读性不高，目的性不明显，违反了单一原则，
class Vehicle {
	public void run(String vehicle) {
		if ("汽车".equals(vehicle)) {
			System.out.println(vehicle + " 在公路行驶...");
		} else if ("轮船".equals(vehicle)) {
			System.out.println(vehicle + " 在水上航行...");
		} else if ("飞机".equals(vehicle)) {
			System.out.println(vehicle + " 在天上飞行...");
		} else {
			System.out.println("nothing...");
		}
		
	}
}
