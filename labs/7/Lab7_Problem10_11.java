public class Lab7_Problem10_11 extends Circle2D
{
	public static void main(String[]args)
	{
		Circle2D circle1=new Circle2D(2,2,5.5);
		
		System.out.println("Circle 1 Area ================================= "+
		circle1.getArea());
		System.out.println("Circle 1 Perimeter ============================ "+
		circle1.getPerimeter());
		System.out.println("Does Circle 1 contain point(3,3) ============== "+
		circle1.contains(3, 3));
		System.out.println("Does Circle 1 contain point(4,5)& Radius 10.5 = "+
		circle1.contains(new Circle2D(4,5,10.5)));
		System.out.println("Does Circle 1 contain point(3,5)& Radius 2.3 == "+
		circle1.overlaps(new Circle2D(3,5,2.3)));
	}
}