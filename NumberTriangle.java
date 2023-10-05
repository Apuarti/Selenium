package firstjava;

public class NumberTriangle {

	public static void main(String[] args) {
		int num=6;
		for(int i=1; i<=num; i++) {
			System.out.println(i);
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
