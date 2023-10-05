package firstjava;

public class StringArray {

	public static void main(String[] args) {
		String str="selenium";
		String[] rev=str.split("");
		for(int i=0; i<rev.length; i++) {
			System.out.print(str.charAt(i)+",");
		}
		
		

	}

}
