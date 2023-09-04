import java.util.Scanner;

public class printName5Times{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recursion(1,n);
	}

	static void recursion(int i, int n){
		if(i>n){
			return;
		}
		System.out.println("Avishek, one day you will Rock...");
		recursion(i+1,n);
	}
}