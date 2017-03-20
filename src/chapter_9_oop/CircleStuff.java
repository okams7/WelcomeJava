package chapter_9_oop;

import ext_tools.Circle;

public class CircleStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle();
		 System.out.println("The area of the circle of radius "
		 + circle1.getRadius() + " is " + circle1.getArea());
		
		 // Create a circle with radius 25
		 Circle circle2 = new Circle(25);
		 System.out.println("The area of the circle of radius "
		 + circle2.getRadius() + " is " + circle2.getArea());
		
		 // Create a circle with radius 125
		 Circle circle3 = new Circle(125);
		 System.out.println("The area of the circle of radius "
		 + circle3.getRadius() + " is " + circle3.getArea());
		
		 // Modify circle radius
		 circle2.setRadius(100);
		 System.out.println("The area of the circle of radius "
		 + circle2.getRadius() + " is " + circle2.getArea());
	}

}
