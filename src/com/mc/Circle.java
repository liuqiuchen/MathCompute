package com.mc;

public class Circle extends Shape {
	final float num = 3.14f;
	public float r;
	
	//重写抽象类父类方法
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		float cGirth = 2*num*r;
		System.out.println("圆形的周长为：" + cGirth);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float cArea = num*r*r;
		System.out.println("圆形的面积为：" + cArea);
	}

}
