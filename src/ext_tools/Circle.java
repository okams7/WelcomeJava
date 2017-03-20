package ext_tools;

public class Circle {

	private double radius;
	
	 /** Construct a circle with radius 1 */
	public Circle() {
	 radius = 1;
	 }
	
	 /** Construct a circle with a specified radius */
	public Circle(double radius) {
	 this.radius = radius;
	 }
	
	 /** Return the area of this circle */
	 public double getArea() {
	 return radius * radius * Math.PI;
	 }
	
	 /** Return the perimeter of this circle */
	 public double getPerimeter() {
	 return 2 * radius * Math.PI;
	 }
	
	 /** Set a new radius for this circle */
	 public void setRadius(double newRadius) {
	 radius = newRadius;
	 }
	 
	 public double getRadius() {
		return radius;
	}
}
