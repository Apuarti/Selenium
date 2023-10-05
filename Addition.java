package firstjava;

public class Addition {
	
	public int add(int a, int b) {
		return a+b;
		
		
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Addition sum= new Addition();
		sum.add(3,9);
		sum.add(3, 3, 5);
		
		

	}

}
