package firstjava;

public class Duplicates {

	public static void main(String[] args) {
		String str="aparnap";
		int length=str.length();
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println( "duplicates=="+str.charAt(i));
				break;
				}
			}
		}
		subStrings();
		
		}
	public static void subStrings() {

	      String strr = "Welcome to Tutorialspoint";
	      
	      String sub = strr.substring(10, 25);
	      System.out.println(sub);

	     
	}

}
