public class Arr {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 7, 2, 1 };
		int t;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++ ) {
				if(arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}