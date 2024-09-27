package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,23,12,6,23,23,6,43);
		
		List<Integer> squaredList = getSquaredList(numbers);
		System.out.println(squaredList);
		
		int sum = addList(numbers);
//		System.out.println(sum);
//		printDistinctNo(numbers);
//		printListInSortedOrder(numbers);
//		printDistinctNoInSortedOrder(numbers);
	}
	
	// collect() - method
	private static List<Integer> getSquaredList(List<Integer> numbers) {
		return numbers.stream()
				.map(num -> num * num)
				.collect(Collectors.toList());
	}

	// distinct() & sorted() - method
	private static void printDistinctNoInSortedOrder(List<Integer> numbers) {
		numbers.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}

	// sorted() - method
	private static void printListInSortedOrder(List<Integer> numbers) {
		numbers.stream()
				.sorted()
				.forEach(System.out::println);
	}
	
	// distinct() - method
	private static void printDistinctNo(List<Integer> numbers) {
		numbers.stream()
				.distinct()
				.forEach(System.out::println);
	}

	private static int sum(int a, int b) {
		return a+b;
	}
	
	// reduce() - method
	private static int addList(List<Integer> numbers) {
		return numbers.stream()
				// Stream on numbers -> One result value
				//Combine them into one result => One Value
				// 0 and (a,b) -> a+b
//				.reduce(0, FP02Functional::sum);
//				.reduce(0, (a,b)-> a+b);
				.reduce(0, Integer::sum);
	}


}
