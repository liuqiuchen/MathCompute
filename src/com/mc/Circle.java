package com.mc;

public class Circle extends Shape {
	final float num = 3.14f;
	public float r;
	
	//��д�����ุ�෽��
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		float cGirth = 2*num*r;
		System.out.println("Բ�ε��ܳ�Ϊ��" + cGirth);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float cArea = num*r*r;
		System.out.println("Բ�ε����Ϊ��" + cArea);
	}

}
