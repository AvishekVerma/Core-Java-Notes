public class MyFirstApp{

	public static void main(String[] args){
		System.out.println("I Rule!");
		System.out.println("The World");

		// do Something
		int x=3;
		String name="Dirk";
		x=x*17;
		System.out.println("x is "+x);
		double d=Math.random();;
		//this is a comment

		// do something again and again
		while(x>12){
			x=x+1;
		}

		for(int y=0;y<10;y=y+1){
			System.out.println("y is now "+y);
		}

		// do something under this condition
		if(x==10){
			System.out.println("x must be 10");
		}else{
			System.out.println("x isn't 10");
		}
		x=2;
		if((x<3)&(name.equals("Dirk"))){
			System.out.println("Gently");
		}
		System.out.println("This line runs no matter what");
	}

}