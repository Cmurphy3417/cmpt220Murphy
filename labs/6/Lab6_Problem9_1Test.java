package Lab6;

import Lab6.Lab6_Problem9_1.Rectangle;

public class Lab6_Problem9_1Test {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);
		System.out.println("Rectangle 1 has a width of " + rect1.width + " and a height of " + 
		rect1.height + " it also has an area of " + rect1.getArea() + " and a perimeter of " +
				rect1.getPerimeter() );
		
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle 2 has a width of " + rect2.width + " and a height of " + 
				rect2.height + " it also has an area of " + rect2.getArea() + " and a perimeter of " +
						rect2.getPerimeter() );
		
	}

}
