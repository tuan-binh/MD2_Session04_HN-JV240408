package baitap.bai3;

public class TestStopWatch {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		// tại thời điểm startTime = 4:06
//		stopWatch.start();
		// thực hiện selection sort
		int[] arr = new int[100000];
		for (int i = 0; i < 100000; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int tempIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[tempIndex]) {
					tempIndex = j;
				}
			}
			if (tempIndex != i) {
				int temp = arr[tempIndex];
				arr[tempIndex] = arr[i];
				arr[i] = temp;
			}
		}
//		System.out.println(Arrays.toString(arr));
		stopWatch.stop();
		// khi stop tại thời điểm 4:20
		
		// tính toán khoảng thời gian thôi endTime - startTime
		System.out.println(stopWatch.getElapsedTime() + " ");
	}
}
