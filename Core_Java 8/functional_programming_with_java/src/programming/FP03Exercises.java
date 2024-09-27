package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		// Exercise - 12 
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		
		BinaryOperator<Integer> sumAccumulator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t+u;
			}
			
		};
		
//		int sum = numbers.stream()
//						.reduce(0, sumAccumulator2);
//		System.out.println(sum);
		
		// Exercise - 13
		
		List<Integer> squaredList = mapAndCreateNewList(numbers, x->x*x);
//		System.out.println(squaredList);
		
		List<Integer> cubedList = mapAndCreateNewList(numbers, x->x*x*x);
		System.out.println(cubedList);
			
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mapper) {
		return numbers.stream()
						.map(mapper)
						.collect(Collectors.toList());
	}
}
