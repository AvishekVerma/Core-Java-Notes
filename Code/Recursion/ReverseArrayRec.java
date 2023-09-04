import java.util.Scanner;

public class ReverseArrayRec{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		int n = 4;
		int[] arr = {1,2,3,4};
		// int[] arr = new int[n];
		int[] revArr= reverse(0,n-1,arr);

		for(int val:revArr){
			System.out.print(val+ " ");
		}
		
	}

	static int[] reverse(int i, int n, int[] arr){
		if(i>=n){
			return arr;
		}
		int temp = arr[i];
		arr[i] = arr[n];
		arr[n] = temp;
		return reverse(i+1,n-1,arr);
	}
}