package firstjava;

public class App_practice {

	public static void main(String[] args) {
		// Maximum of three numbers
		int a = 10;
		int b = 29;
		int c = 50;
		if (a > b && a > c) {
			System.out.println("a is big number");
		} else if (b > a && b > c) {
			System.out.println("b is big number");
		} else {
			System.out.println("c is big number");
		}

		// Swap Two Numbers
		int num1 = 100;
		int num2 = 50;
		num1 = num1 + num2;// 150
		num2 = num1 - num2;// 100
		num1 = num1 - num2;// 50
		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);

		// Average and Sum

		int i = 4;
		int j = 21;
		float sum;
		float avg;

		sum = i + j;
		avg = ((i + j) / 2);
		System.out.println("sum:- " + sum + "\naverage:- " + avg);

		// Area of Circle

		int radius = 10;
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is " + area);

		// Generate 5 numbers

		for (int x = 1; x <= 5; x++) {

			System.out.println((int) (Math.random() * 50));
		}
		// Compound interest

		double principal_amount = 25.50;
		double interest_rate = 3.5;
		double time_period = 30.0;
		double compoundinterest = 4.0;
		compoundinterest = principal_amount * Math.pow((1 + interest_rate / 100), time_period);
		System.out.println("");
		System.out.println("compound interest: " + compoundinterest);

		// Leap year

		int year = 2020;
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is a not leap year");
		}

		// fibonacci series

		int num = 9;
		int f1, f2 = 0, f3 = 1;
		for (int x = 1; x <= num; x++) {
			System.out.println(f3 + " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}

		// sum of its digit
		int input = 152;
		int sum1 = 0;
		while (input != 0) {
			int lastdigit = input % 10;//
			System.out.println(lastdigit);
			sum1 = sum1 + lastdigit;
			input = input / 10;
			System.out.println(input);

		}
		System.out.println("sum of its digit is :-" + sum1);

	
	//reverse a string in java
	String string="whatever your name";
	String reverse = new StringBuffer(string).reverse().toString();
	System.out.println(reverse);
	System.out.println("length of the string is:-"+ string.length());
	System.out.println("length of the string without space:-"+ string.replace(" ", "").length());
	
	//Factorial
	int input2=6;
	int result=1;
	while(input2>1) {
		result=result*input2;
		System.out.println(result);
		input2--;
		
	}
	System.out.println("factorial number is :-"+ result);
	
	//reverse the string
	String string2="aparna";
	//String reverse2 = new StringBuffer(string2).reverse().toString();
	//System.out.println(reverse2);
	
	for(int f= string2.length()-1; f>=0; f--) {
		System.out.println( string2.charAt(f));
	}
	
	
	//print string one by one 
	for(int e=0; e<string2.length(); e++) {
		
		char c1= string2.charAt(e);
		System.out.print(c1);
		
	}
	//prime numbers
	int n=9, status=1, num3=1;
	
	
	if (num>=1) {
		System.out.println("first "+n+ "prime numbers are");
		System.out.println(2);
		
	}
	
	for(int count=2; count<=n;) {
		for(int k=2; k<=Math.sqrt(num3); k++){
		if(num%k==0) {
			status=0;
			break;
		}
				
	}
	if(status!=0) {
		System.out.println(num);
		count++;
	}
	status=1;
	num++;
	}
	//odd or even
	int k=20;
	int l=25;
	if (k%2==0 || l%2==0) {
		System.out.println("k is even number " );
		
	}else {
		System.out.println("This is odd number");

		
	}
			
	

}}
