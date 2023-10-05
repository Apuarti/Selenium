package firstjava;

public class LargestArrayNumber {

	public static void main(String[] args) {
		int[] arr = { 20, 22, 35, 70, 12, 100 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			System.out.println("total number :-" + arr[i]);
			if (arr[i] > max) //
				max = arr[i];

		}
		System.out.println(max);

	}

}
