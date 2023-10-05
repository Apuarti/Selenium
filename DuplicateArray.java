package firstjava;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr= {3,5,9,3,8,6,5};
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

	}

}
