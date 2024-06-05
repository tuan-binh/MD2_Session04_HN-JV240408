package baitap.bai2;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		// khởi tạo đối tượng quadratic equation
		QuadraticEquation eq = new QuadraticEquation();
		eq.setA(1);
		eq.setB(-2);
		eq.setC(1);
		
		System.out.println(eq.getDelta());
		System.out.println("Nghiệm 1 = " + eq.getRoot1());
		System.out.println("Nghiệm 2 = " + eq.getRoot2());
	}
}
