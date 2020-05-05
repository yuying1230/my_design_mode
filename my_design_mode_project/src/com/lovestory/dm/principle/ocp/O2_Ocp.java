package com.lovestory.dm.principle.ocp;

public class O2_Ocp {

	public static void main(String[] args) {
		O2_GraphicEditor ge = new O2_GraphicEditor();
		ge.drawShape(new O2_Circle());
		ge.drawShape(new O2_Rectangle());
		ge.drawShape(new O2_Triangle());
	}

}

//����һ�����ڻ�ͼ���� [ʹ�÷�] 
class O2_GraphicEditor {
	// ���� Shape ����Ȼ����� type�������Ʋ�ͬ��ͼ��
	public void drawShape(O2_Shape s) {
		s.draw();
	}
}

// Shape����ɳ�����
abstract class O2_Shape {
	int m_type;

	public abstract void draw();
}

class O2_Rectangle extends O2_Shape {
	O2_Rectangle() {
		super.m_type = 1;
	}

	@Override
	public void draw() {
		System.out.println(" ���ƾ��� ");
	}
}

class O2_Circle extends O2_Shape {
	O2_Circle() {
		super.m_type = 2;
	}

	@Override
	public void draw() {
		System.out.println(" ����Բ�� ");
	}
}

class O2_Triangle extends O2_Shape {
	O2_Triangle() {
		super.m_type = 3;
	}

	@Override
	public void draw() {
		System.out.println(" ���������� ");
	}
}
