
class FindLargestSmallestNumber {
	public static void main(String[] args) {
		int[] a = { 11, 2, 3, 4, 5, 56, 6, 6 };
		int smallest = a[0];
		int largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest)
				largest = a[i];
			else
				smallest = a[i];
			}
			System.out.println(largest);
			System.out.println(smallest);
		}
	}