package com.mc;

/**������**/
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ʵ����
		Ractangle ract = new Ractangle();
		Circle circle = new Circle();
		
		ract.width = 3.5f;
		ract.height = 2f;
		ract.girth();
		ract.area();
		
		circle.r = 1f;
		circle.girth();
		circle.area();
		
	}

}
