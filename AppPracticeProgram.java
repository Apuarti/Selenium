package firstjava;

public class AppPracticeProgram {
	public static void main(String[] args) {
		Swap2Numbers();
		compare_two_strings();
		stringCount();
		maxOfThreeNumbers();
		reverseTheNumber();
		leapYear();
		numberTriangle();

		duplicateCharactersInString();
		palindromeString();
		reverseString("aparna");

	}

	public static void Swap2Numbers() {

		int num1 = 100;
		int num2 = 50;
		// logic
		num1 = num1 + num2; // 150
		num2 = num1 - num2; // 100
		num1 = num1 - num2; // 50
		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);

	}

	public static void compare_two_strings() {
		String s1 = "aparna";
		String s2 = "aparna";
		// boolean b= (s1.contentEquals(s2));
		if (s1 == s2) {
			System.out.println("both the strings are equal");
		} else {
			System.out.println("both the Strings are not equal");
		}

	}

	public static void stringCount() {
		String st = "java is good";
		int sc = st.length();
		System.out.println("total string count :- " + sc);
		int stringLenthWithoutSpaces = st.replace(" ", "").length();
		System.out.println("Total string length:- " + stringLenthWithoutSpaces);

	}

	public static void maxOfThreeNumbers() {
		int a = 10;
		int b = 25;
		int c = 50;
		if (a > b && a > c) {
			System.out.println("a is big number");

		} else if (b > a && b > c) {
			System.out.println("b is big number");

		} else {
			System.out.println("c is big number");

		}
	}

	public static void reverseTheNumber() {
		int num = 15;
		int remainder = 2;
		int result = 0;

		while (num > 0) {
			remainder = num % 10;
			result = result * 10 + remainder;
			num = num / 10;
			System.out.println("reverse of the number is:- " + result);

		}
	}

	public static void leapYear() {
		int year = 2020;
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " its leap year");
		} else {
			System.out.println(year + " its not a leap year");
		}
	}

	public static void numberTriangle() {

		int i = 5, j = 5;

		for (i = 1; i <= 5; i++) {
			// Determine number of spaces needed
			// print spaces
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}

	public static void duplicateCharactersInString() {
		String st = "malyalam";
		char[] ch = st.toCharArray();
		System.out.println(ch);
		for (int m = 0; m < st.length(); m++) {
			for (int n = m + 1; n < st.length(); n++) {
				if (ch[n] == ch[m]) {
					System.out.println(ch[n]);
					break;

				}

			}

		}

	}

	public static void palindromeString() {
		String str = "sgeegs";
		int forward;
		for (forward = 0; forward < str.length()/2; forward++) {
			if (str.charAt(forward) != str.charAt(str.length()- 1 - forward)) {
				break;
			}
		}
		System.out.println(forward);
		if (forward == str.length()/2 ) {
			System.out.println("it is a palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}

	}
	public static void reverseString(String str) {
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}

	}

}
