package javaProblems;

public class ReversegivenPartOfArry {

	public static void main(String[] args) {
		
		int[] arr= {1,4,5,3,8,6,4,2};
		// index 3 to 6
		// 1,4,5,4,6,8,3,2
		
		
		reverseArray(arr,3,6);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void reverseArray(int[] arr, int sp,int ep) {
	
		while(sp<ep) {
			
		int temp= arr[sp];
		arr[sp]=arr[ep];
		arr[ep]=temp;
		sp++;
		ep--;
	}

}
}
