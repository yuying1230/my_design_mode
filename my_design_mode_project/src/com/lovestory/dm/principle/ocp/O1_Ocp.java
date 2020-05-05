package com.lovestory.dm.principle.ocp;

public class O1_Ocp {

	public static void main(String[] args) {
		O1_GraphicEditor ge = new O1_GraphicEditor();
		ge.drawCircle(new O1_Circle());
		ge.drawRectangle(new O1_Rectangle());

	}

}

//����һ�����ڻ�ͼ���� [ʹ�÷�] 
class O1_GraphicEditor {
	// ���� Shape ����Ȼ����� type�������Ʋ�ͬ��ͼ��
	public void drawShape(O1_Shape s) {
		if (s.m_type == 1)
			drawRectangle(s);
		else if (s.m_type == 2)
			drawCircle(s);
		else if (s.m_type == 3)
			drawTriangle(s);
	}

	// ���ƾ���
	public void drawRectangle(O1_Shape r) {
		System.out.println(" ���ƾ��� ");
	}

	// ����Բ��
	public void drawCircle(O1_Shape r) {
		System.out.println(" ����Բ�� ");
	}

	// ����������
	public void drawTriangle(O1_Shape r) {
		System.out.println(" ���������� ");
	}
}

//Shape �࣬����
class O1_Shape {
	int m_type;
}

class O1_Rectangle extends O1_Shape {
	O1_Rectangle() {
		super.m_type = 1;
	}
}

class O1_Circle extends O1_Shape {
	O1_Circle() {
		super.m_type = 2;
	}
}

class O1_Triangle extends O1_Shape {
	O1_Triangle() {
		super.m_type = 3;
	}
}
