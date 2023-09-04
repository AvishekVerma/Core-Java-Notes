import java.util.Scanner;

public class SumOfFirstN{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		firstNSum(n,0);
		System.out.println("Sum of First "+ n +" is "+ firstNSumFun(n));
	}
	// Parameterized way
	static void firstNSum(int i, int sum){
		if(i<1){
			System.out.println(sum);
			return;
		}
		firstNSum(i-1,sum+i);
	}
	// Function way

	static int firstNSumFun(int n){
		if(n==0){
			return 0;
		}
		return n+firstNSumFun(n-1);
	}
}