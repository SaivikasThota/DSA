package codes;

public class minnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,5,-52};
		
		System.out.println(findmin(arr));
		
	}

	private static int findmin(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return -1;
		}
		int min=arr[0];
		for(int i:arr) {
      //max num ">"
			if(i>min) {
				min=i;
			}
			
		}
		return min;
		
		
		
	}

}
