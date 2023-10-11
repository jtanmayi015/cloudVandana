package javacodes;

import java.util.Random;

public class ShuffledArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		 shuffledArray(arr);
		 
		 for(int n:arr) {
			 System.out.print(" "+n);
		 }

	}

	private static void shuffledArray(int[] arr) {
		int n = arr.length;
		
		Random rand = new Random();
		
		for(int i=n-1;i>0;i--) {
			int j = rand.nextInt(i+1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = arr[i];
		}// TODO Auto-generated method stub

	}

}
