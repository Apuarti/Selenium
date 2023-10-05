package firstjava;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a = { 20, 26, 78, 45, 67, 98 };
		int max1 = 0, max2 = 0;
		if (a[0] > a[1]) {
			max1 = a[0];
			max2 = a[1];
		} else {
			max1 = a[1];
			max2 = a[0];

		}
		for (int i = 2; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;//26      max1=98
				max1 = a[i];//78      max2=78


			}
			else if(a[i]>max2){
			
				max2=a[i];//45//67
			}
		}
		System.out.println(max2);


	}

}
