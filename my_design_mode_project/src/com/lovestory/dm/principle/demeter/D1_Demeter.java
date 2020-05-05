package com.lovestory.dm.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class D1_Demeter {

	public static void main(String[] args) {
		// ������һ�� SchoolManager ����
		D1_SchoolManager schoolManager = new D1_SchoolManager();
		// ���ѧԺ��Ա�� id �� ѧУ�ܲ���Ա����Ϣ
		schoolManager.printAllEmployee(new D1_CollegeManager());
	}

}

//ѧУ�ܲ�Ա����
class D1_Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//ѧԺ��Ա����
class D1_CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}

// ����ѧԺԱ���Ĺ����� 
class D1_CollegeManager {
	// ����ѧԺ������Ա��
	public List<D1_CollegeEmployee> getAllEmployee() {
		List<D1_CollegeEmployee> list = new ArrayList<D1_CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // �������������� 10 ��Ա���� list
			D1_CollegeEmployee emp = new D1_CollegeEmployee();
			emp.setId("ѧԺԱ�� id= " + i);
			list.add(emp);
		}
		return list;
	}
}

// ѧУ������

// ���� D1_SchoolManager ���ֱ������������Щ : D1_Employee��D1_CollegeManager
// D1_CollegeEmployee ���� ֱ�����ѣ�����һ��İ���࣬����Υ���� �����ط���
class D1_SchoolManager {
	// ����ѧУ�ܲ���Ա��
	public List<D1_Employee> getAllEmployee() {
		List<D1_Employee> list = new ArrayList<D1_Employee>();

		for (int i = 0; i < 5; i++) { // �������������� 5 ��Ա����
			D1_Employee emp = new D1_Employee();
			emp.setId("ѧУ�ܲ�Ա�� id= " + i);
			list.add(emp);
		}
		return list;
	}

	// �÷���������ѧУ�ܲ���ѧԺԱ����Ϣ�ķ���(id)
	void printAllEmployee(D1_CollegeManager sub) {

		// ��������
		// 1. �� �� �� D1_CollegeEmployee ����D1_ SchoolManager ��ֱ������
		// 2. D1_CollegeEmployee ���Ծֲ�������ʽ������ D1_SchoolManager
		// 3. Υ���� �����ط���

		// ��ȡ��ѧԺԱ��
		List<D1_CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------ѧԺԱ��------------");
		for (D1_CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		// ��ȡ��ѧУ�ܲ�Ա��
		List<D1_Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��------------");
		for (D1_Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
