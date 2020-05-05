package com.lovestory.dm.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class D1_Demeter {

	public static void main(String[] args) {
		// 创建了一个 SchoolManager 对象
		D1_SchoolManager schoolManager = new D1_SchoolManager();
		// 输出学院的员工 id 和 学校总部的员工信息
		schoolManager.printAllEmployee(new D1_CollegeManager());
	}

}

//学校总部员工类
class D1_Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//学院的员工类
class D1_CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}

// 管理学院员工的管理类 
class D1_CollegeManager {
	// 返回学院的所有员工
	public List<D1_CollegeEmployee> getAllEmployee() {
		List<D1_CollegeEmployee> list = new ArrayList<D1_CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // 这里我们增加了 10 个员工到 list
			D1_CollegeEmployee emp = new D1_CollegeEmployee();
			emp.setId("学院员工 id= " + i);
			list.add(emp);
		}
		return list;
	}
}

// 学校管理类

// 分析 D1_SchoolManager 类的直接朋友类有哪些 : D1_Employee、D1_CollegeManager
// D1_CollegeEmployee 不是 直接朋友，而是一个陌生类，这样违背了 迪米特法则
class D1_SchoolManager {
	// 返回学校总部的员工
	public List<D1_Employee> getAllEmployee() {
		List<D1_Employee> list = new ArrayList<D1_Employee>();

		for (int i = 0; i < 5; i++) { // 这里我们增加了 5 个员工到
			D1_Employee emp = new D1_Employee();
			emp.setId("学校总部员工 id= " + i);
			list.add(emp);
		}
		return list;
	}

	// 该方法完成输出学校总部和学院员工信息的方法(id)
	void printAllEmployee(D1_CollegeManager sub) {

		// 分析问题
		// 1. 这 里 的 D1_CollegeEmployee 不是D1_ SchoolManager 的直接朋友
		// 2. D1_CollegeEmployee 是以局部变量方式出现在 D1_SchoolManager
		// 3. 违反了 迪米特法则

		// 获取到学院员工
		List<D1_CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------学院员工------------");
		for (D1_CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		// 获取到学校总部员工
		List<D1_Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (D1_Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
