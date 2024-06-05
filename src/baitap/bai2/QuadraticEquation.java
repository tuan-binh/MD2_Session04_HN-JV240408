package baitap.bai2;

public class QuadraticEquation {
	// 1. thuộc tính
	private int a, b, c;
	// 2. constructor
	
	public QuadraticEquation() {
	}
	
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// 3. các phương thức
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public double getDelta() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1() {
		return (-b - Math.sqrt(getDelta())) / (2 * a);
	}
	
	public double getRoot2() {
		return (-b + Math.sqrt(getDelta())) / (2 * a);
	}
	
}
