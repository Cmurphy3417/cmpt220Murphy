package Lab6;

public class Lab6_Problem9_1 {
	static class Rectangle {
		//declare the width and height
		double width = 1;
		double height = 1;
		
		//no arg constructor
		Rectangle(){
			
		}
		
		//specified width and height
		Rectangle(double newWidth, double newHeight){
			width = newWidth;
			height = newHeight;
		}
		public double getArea(){
			return width * height;
		}
		public double getPerimeter(){
			return (2 * width) + (2 * height);
		}

	
  }
	public static void main(String[] args) {
	}
}
