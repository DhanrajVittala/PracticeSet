package javaProblems;

public class GraterThanItself {

	public static void main(String[] args) {
		int[] arr= {2,5,4,8,9,5,9,9,1}; //6
		
		int u=count1(arr);
		System.out.println(u);
	
		
	}
		public static int count1(int[] arr) {
			int max=Integer.MIN_VALUE;
			
			
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
		}
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==max) {
				count++;
			}
			
		}
		System.out.println(max);
		return arr.length-count;
	}
		

}
