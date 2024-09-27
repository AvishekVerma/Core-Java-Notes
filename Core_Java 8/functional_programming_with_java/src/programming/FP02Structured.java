package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,23,34,56,23,67,546,43);
		
		int sum = addList(numbers);
		System.out.println(sum);
	}

	private static int addList(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}


}
