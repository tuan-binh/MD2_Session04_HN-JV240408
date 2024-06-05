package baitap.bai1;

public class Circle {
	// 1. thuộc tính
	private double radius;
	private String color;
	// 2. constructor
	
	public Circle() {
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// 3. các phương thức
	
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// phương thức trả về chu vi hình tròn
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// phương thức trả về diện tích
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
