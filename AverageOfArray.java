
public class AverageOfArray {
	public static void main(String[] args){
	int[] array = {10,10,10,10,10,10,10,10,10,10};
	int sum = 0;
	for (int i=0; i<array.length; i++) {
		sum = sum + array[i] ;
	}
	System.out.println("Array size is: "+ array.length);
	System.out.println("Summ of arrray elements:" + sum);
	double average = sum/array.length;
	System.out.println("Average of array elements: "+ average);
	}
}
