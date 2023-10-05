package firstjava;

public class Palindrom {

	public static void main(String[] args) {
		String str = "palawp";
		String rev = "";
		for (int i = (str.length()) - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("its palindrom");
		} else {
			System.out.println("its not palindrom");
		}

		int num = 24542;
		int rem = 0;
		int result = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;// 5//4//2
			result = (result * 10) + rem;// 5//54//22
			num = num / 10;// 24//2

		}
		System.out.println(result);

		
		if (result == temp) {
			System.out.println("its palindrom");

		} else {
			System.out.println("its not palindrom");
		}

	}
}
