package com.lovestory.dm.principle.ocp;

public class O1_Ocp {

	public static void main(String[] args) {
		O1_GraphicEditor ge = new O1_GraphicEditor();
		ge.drawCircle(new O1_Circle());
		ge.drawRectangle(new O1_Rectangle());

	}

}

//这是一个用于绘图的类 [使用方] 
class O1_GraphicEditor {
	// 接收 Shape 对象，然后根据 type，来绘制不同的图形
	public void drawShape(O1_Shape s) {
		if (s.m_type == 1)
			drawRectangle(s);
		else if (s.m_type == 2)
			drawCircle(s);
		else if (s.m_type == 3)
			drawTriangle(s);
	}

	// 绘制矩形
	public void drawRectangle(O1_Shape r) {
		System.out.println(" 绘制矩形 ");
	}

	// 绘制圆形
	public void drawCircle(O1_Shape r) {
		System.out.println(" 绘制圆形 ");
	}

	// 绘制三角形
	public void drawTriangle(O1_Shape r) {
		System.out.println(" 绘制三角形 ");
	}
}

//Shape 类，基类
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
