package com.lovestory.dm.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class D2_Demeter {

	public static void main(String[] args) {
		// 创建了一个 SchoolManager 对象
		D2_SchoolManager schoolManager = new D2_SchoolManager();
		// 输出学院的员工 id 和 学校总部的员工信息
		schoolManager.printAllEmployee(new D2_CollegeManager());
	}

}

//学校总部员工类
class D2_Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//学院的员工类
class D2_CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}

// 管理学院员工的管理类 
class D2_CollegeManager {
	// 返回学院的所有员工
	public List<D2_CollegeEmployee> getAllEmployee() {
		List<D2_CollegeEmployee> list = new ArrayList<D2_CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // 这里我们增加了 10 个员工到 list
			D2_CollegeEmployee emp = new D2_CollegeEmployee();
			emp.setId("学院员工 id= " + i);
			list.add(emp);
		}
		return list;
	}

	public void printEmployee() {
		// 获取到学院员工
		List<D2_CollegeEmployee> list1 = this.getAllEmployee();
		System.out.println("------------学院员工------------");
		for (D2_CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

// 学校管理类
class D2_SchoolManager {
	// 返回学校总部的员工
	public List<D2_Employee> getAllEmployee() {
		List<D2_Employee> list = new ArrayList<D2_Employee>();

		for (int i = 0; i < 5; i++) { // 这里我们增加了 5 个员工到
			D2_Employee emp = new D2_Employee();
			emp.setId("学校总部员工 id= " + i);
			list.add(emp);
		}
		return list;
	}

	// 该方法完成输出学校总部和学院员工信息的方法(id)
	void printAllEmployee(D2_CollegeManager sub) {

		// 分析问题
		// 将输出学院员工方法，封装到 D2_CollegeManager 类中
		sub.printEmployee();
		
		// 获取到学校总部员工
		List<D2_Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (D2_Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
