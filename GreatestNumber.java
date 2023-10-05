package firstjava;

public class GreatestNumber {
	static int largestNum(int a, int b) {
		return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);
	}

	// Drivers code
	public static void main(String[] args) {
		int a = 2267, b = 1231;
		System.out.println(largestNum(a, b));

		String str = "selenium";
		 int ccount=0;
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
			//System.out.println(i);
			ccount++;

		}
		System.out.println(ccount);
	}
}
