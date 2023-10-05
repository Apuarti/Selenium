package firstjava;

public class Febonacci {

	public static void main(String[] args) {
		// 0, 1, 1,2,3,5
		int num = 6;
		int f1 = 0, f2 = 0, f3 = 1;
		System.out.print(f1 + " ");

		for (int i = 1; i < num; i++) {
			System.out.print(f3 + " ");

			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;

		}

		// factorial number
		// 5*4*3*2*1
		int number = 5;
		int result = 1;
		while (number > 0) {
			result = result * number;// 5
			number--;

		}
		System.out.println(result);

	


	
}

}
