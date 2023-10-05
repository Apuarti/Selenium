package firstjava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		String str = "selenium is automation suite automation suite";
		String[] words = str.split(" ");
		// int count=0;

		/*
		 * for(int i=0; i<words.length; i++) { for (int j=i+1; j<words.length; j++) {
		 * if(words[i]==words[j]) {
		 */

		Set<String>  set = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			if (set.contains(words[i])) {
				System.out.println(words[i] + " is a duplicate word.");

			} else {
				set.add(words[i]);

			}
		}

		 System.out.println(set);

	}
}
