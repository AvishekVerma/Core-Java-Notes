package programming;

import java.util.List;

public class FP01Functional {
	
public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,23,34,56,56,43,23,34);
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers); 
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number%2==0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
//		What to do?
//		numbers.stream()
//				.forEach(FP01Functional::print);
		// Improving above code
		numbers.stream()
				.forEach(System.out::println);	//Method reference
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
//				.filter(FP01Functional::isEven) //Filter - only allow even numbers
				.filter((number)-> number%2==0)
				.forEach(System.out::println);	//Method reference
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
//				.filter(FP01Functional::isEven) //Filter - only allow even numbers
				.filter((number)-> number%2==0)
				//mapping - x -> x * x
				.map(number -> number * number)
				.forEach(System.out::println);	//Method reference
	}

	

}
