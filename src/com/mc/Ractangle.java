package com.mc;

public class Ractangle extends Shape {
	public float width;
	public float height;
	
	//��д�����ุ�෽��
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		float rGirth = (width + height)*2;
		System.out.println("���ε��ܳ�Ϊ��" + rGirth);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float rArea = width*height;
		System.out.println("���ε����Ϊ��" + rArea);
	}
	
}
