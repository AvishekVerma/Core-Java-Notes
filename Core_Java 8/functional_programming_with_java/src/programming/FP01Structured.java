package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,23,34,56,23,67,546,43);
		
//		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			// Check if no. is even or not
			if(number%2==0)
				System.out.println(number);
		}
	}

}
