package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,3,5,6,2,9,11);
		
		List<String> courses = 
				List.of("Spring","Spring Boot","API", "Microservices",
						"AWS", "PCF","Azure","Docker","Kubernetes","Boot");
		
//		int sumOfSquares = getSumOfSquares(numbers);
//		System.out.println("Sum of Squares : "+ sumOfSquares);
		
//		int sumOfCubes = getSumOfCubes(numbers);
//		System.out.println("Sum of Cubes : "+ sumOfCubes);
		
//		int sumOfOddNo = getSumOfOddNo(numbers);
//		System.out.println("Sum of Odd No. : "+ sumOfOddNo);
		
//		List<Integer> evenNoList = getEvenNoList(numbers);
//		System.out.println("Even No List : "+ evenNoList);
		
		List<String> courseLengthList = getCourseLengtheList(courses);
		System.out.println("Course list with its lengthe :\n"+ courseLengthList);
	}
	
	//Exercise - 10
	private static List<String> getCourseLengtheList(List<String> courses) {
		return courses.stream()
				.map(course -> course+"--"+course.length())
				.collect(Collectors.toList());
	}

	//Exercise - 10
	private static List<Integer> getEvenNoList(List<Integer> numbers) {
		return numbers.stream()
				.filter(num -> num%2==0)
				.collect(Collectors.toList());
	}

	//Exercise - 9
	private static int getSumOfOddNo(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number%2==1)
				.reduce(0, (a,b)-> a+b);
	}

	//Exercise - 8
	private static int getSumOfCubes(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number * number * number)
				.reduce(0, (a,b)-> a+b);
	}

	//Exercise - 7
	private static int getSumOfSquares(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number * number)
				.reduce(0, (a,b)-> a+b);
	}
	
}
