package baitap.bai1;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle(5, "red");
		System.out.println(c);
		// in ra màu và bán kính
		System.out.println("Radius: " + c.getRadius() + " Color: " + c.getColor());
		// in ra chu vi
		System.out.println("Chu vi hình tròn: " + c.getPerimeter());
		// in ra diện tích
		System.out.println("Diện tích hình tròn: " + c.getArea());
	}
}
