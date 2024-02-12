
public class Arrays1 {
	public static void main(String[] args) {

		int[] arr = { 5, 6, 8, 2, 1, 5, 9, 3 };
		
		int n = arr.length - 1;
		int k=3;

		swapArray(arr, 0, n);
		swapArray(arr,0,k-1);
		swapArray(arr,k,n);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void swapArray(int[] arr, int sp, int ep) {

		while (sp < ep) {
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;
			sp++;
			ep--;

		}

	}
}