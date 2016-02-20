package com.mc;

public class Ractangle extends Shape {
	public float width;
	public float height;
	
	//重写抽象类父类方法
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		float rGirth = (width + height)*2;
		System.out.println("矩形的周长为：" + rGirth);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float rArea = width*height;
		System.out.println("矩形的面积为：" + rArea);
	}
	
}
