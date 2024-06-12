package codes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//Intializing Array
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
    //Target to be searched
		int target=3;
		int num=sorting(arr,target);
		System.out.println(num);
	}



	private static int sorting(int []arr,int target) {
		
		if(arr.length==0) {
			return -1;
		}
    //Searching each and every element one after another in an Unsorted Array
		for (int index=0;index <=arr.length;index++){
			if(arr[index]==target) {
				return index;
			}
		}
		return -1;
	}

	
}

	 //Time complexity best case-O(1)--> Because if the first element which we are searching is in arr[0]. No need to search others
  // Worst Case: Element not present in Array, in that case we need to compare every element. Here no.of comparisions is total number of elements. so Time complexity is O(N)
