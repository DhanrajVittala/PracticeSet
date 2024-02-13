package javaProblems;

public class TwoSumFind {

	public static void main(String[] args) {
		int [] arr= {2,6,8,5,6,}; //7 true
           int sum=0;
           
           boolean u=sumFind(arr,sum);
           System.out.println(u);
	}
           public static boolean sumFind(int[] arr,int sum) {
           for (int i=0;i<=arr.length-2;i++) {
        	   for(int j=0; j<=arr.length-1; j++) {
        		   if(arr[i]+arr[j]==sum) {
        		   return true;
        		   }
        	   }
        	   
           }
           return false;
	}

}
