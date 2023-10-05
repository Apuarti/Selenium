package firstjava;

public class MaxFromArray {

	public static void main(String[] args) {
		// Largest number from array
		int[] num1 = { 4, 9, 20, 3, 21, 8, 7,35 };
		int max1 = num1[0], max2 = num1[1];
		if (max2 > max1) {
			max1 = max2;//9
			max2 = max1;//4
		}

		for (int b = 2; b < num1.length; b++) {
			if (num1[b] > max1) {
				max2 = max1;//9//20//21
				max1 = num1[b];//20//21//35

			

		}

	}
		
		System.out.println("largest number--" + max1);
		System.out.println("second largest number--" + max2);
		
		
		
		


}}
