import java.util.Scanner;

public class Factorial{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n,1);
		System.out.println("Factorial of "+n+" is : "+ factFun(n));
	}

	static void fact(int i, int fac){
		if(i==1){
			System.out.println(fac);
			return;
		}
		fact(i-1,fac*i);
	}

	static int factFun(int n){
		if(n==1){
			return 1;
		}
		return n*factFun(n-1);
	}
}