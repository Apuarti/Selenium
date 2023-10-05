package firstjava;

import java.util.Scanner;

public class Dhruv {

	public static void main(String[] args) {

		// Define an array to store the Mother's Day compliments
		String[] compliments = new String[100];
		compliments[0] = "Happy Mother's Day to a new mom!";
		compliments[1] = "You're doing an amazing job as a mom!";
		compliments[2] = "Thank you for being the best mom ever!";
		compliments[3] = "You inspire me with your strength and resilience as a mother.";
		compliments[4] = "You have such a kind and loving heart, andit shows in the way you parent.";
		compliments[5] = "You have an incredible ability to make yourchildren feel loved and supported.";
		compliments[6] = "You are a true supermom!";
		compliments[7] = "Your unwavering dedication to your childrenis truly admirable.";
		compliments[8] = "You have a special talent for making eventhe toughest parenting moments feel manageable.";
		compliments[9] = "Your children are so lucky to have you as their mom.";
		compliments[10] = "You have a heart of gold, and it shines through in your role as a mother.";
		compliments[11] = "Your children are so lucky to have you as their mom.";
		compliments[12] = "Your children are a reflection of your amazing parenting skills.";
		compliments[13] = "Your unconditional love for your children is truly inspiring.";
		compliments[14] = "Your patience and kindness are qualities that make you an incredible mother.";
		compliments[15] = "You have a special ability to make even the smallest moments with your children feel like cherished memories.";
		compliments[16] = "Your parenting style is a perfect balance of nurturing and discipline.";
		compliments[17] = "You always put your children's needs before your own, and it shows in the amazing adults they are becoming.";

		// Add more compliments for subsequent years

		// Get the year when the user's first child was born
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year your first child was born: ");
		int birthYear = scanner.nextInt();

		// Calculate the number of years since the child was born
		int currentYear = java.time.Year.now().getValue();
		int age = currentYear - birthYear;

		// Display the compliments for each year
		for (int i = 0; i <= age && i < compliments.length; i++) {
			System.out.println(compliments[i]);
		}
	}

}
