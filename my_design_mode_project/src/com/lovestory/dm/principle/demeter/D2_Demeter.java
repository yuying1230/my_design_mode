package com.lovestory.dm.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class D2_Demeter {

	public static void main(String[] args) {
		// ������һ�� SchoolManager ����
		D2_SchoolManager schoolManager = new D2_SchoolManager();
		// ���ѧԺ��Ա�� id �� ѧУ�ܲ���Ա����Ϣ
		schoolManager.printAllEmployee(new D2_CollegeManager());
	}

}

//ѧУ�ܲ�Ա����
class D2_Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//ѧԺ��Ա����
class D2_CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}

// ����ѧԺԱ���Ĺ����� 
class D2_CollegeManager {
	// ����ѧԺ������Ա��
	public List<D2_CollegeEmployee> getAllEmployee() {
		List<D2_CollegeEmployee> list = new ArrayList<D2_CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // �������������� 10 ��Ա���� list
			D2_CollegeEmployee emp = new D2_CollegeEmployee();
			emp.setId("ѧԺԱ�� id= " + i);
			list.add(emp);
		}
		return list;
	}

	public void printEmployee() {
		// ��ȡ��ѧԺԱ��
		List<D2_CollegeEmployee> list1 = this.getAllEmployee();
		System.out.println("------------ѧԺԱ��------------");
		for (D2_CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

// ѧУ������
class D2_SchoolManager {
	// ����ѧУ�ܲ���Ա��
	public List<D2_Employee> getAllEmployee() {
		List<D2_Employee> list = new ArrayList<D2_Employee>();

		for (int i = 0; i < 5; i++) { // �������������� 5 ��Ա����
			D2_Employee emp = new D2_Employee();
			emp.setId("ѧУ�ܲ�Ա�� id= " + i);
			list.add(emp);
		}
		return list;
	}

	// �÷���������ѧУ�ܲ���ѧԺԱ����Ϣ�ķ���(id)
	void printAllEmployee(D2_CollegeManager sub) {

		// ��������
		// �����ѧԺԱ����������װ�� D2_CollegeManager ����
		sub.printEmployee();
		
		// ��ȡ��ѧУ�ܲ�Ա��
		List<D2_Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��------------");
		for (D2_Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
