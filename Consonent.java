package firstjava;

public class Consonent {

	public static void main(String[] args) {
		String str="seleniume";
		int vcount=0, ccount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
				vcount++;
				
			}
			else if(ch>'a'&& ch<'z'){
				ccount++;}
			
			
		}
		System.out.println("vowel--"+ vcount);
		System.out.println("consonent--"+ ccount);

		

	}

}
