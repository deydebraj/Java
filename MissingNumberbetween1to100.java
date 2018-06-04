public class MissingNumberbetween1to100 {
	public static void main(String[] args) {
		
		Sample(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},10);			
	}
	static void Sample(int[] arr,int n) {	
		int ExpSum= n*(n+1)/2;
		int ActualSum=0;
		for(int i=0;i<arr.length;i++) {
			ActualSum=ActualSum+arr[i];		
		}
		System.out.println(ActualSum);
		
		int MissingNum=ExpSum-ActualSum;
		
		if(MissingNum==0) {
			System.out.println("Nothing is missing");
		}
		else
		{
			System.out.println("Missing Number is: "+MissingNum);	
		}
	}
}