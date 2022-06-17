package Default;

public class Inheritance {
public static void main(String[] args) {
	Triangle shape=new Triangle();
	Rectangle shape1=new Rectangle();
	
	shape.setValues(10,10);    //seting values in super class
	shape1.setValues(10,10);
	
	System.out.println("Area of triangle is :"+shape.areaOfTriangle());  //calling methods of subclasses
	System.out.println("Area of rectangle is :"+shape1.areaOfRectangle());
}
}
