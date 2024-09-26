package programming;

import java.util.List;

public class FP01Exersises {

public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,23,34,56,56,43,23,34);
//		printEvenNumbers(numbers);
//		printOddNumbers(numbers);
		List<String> courses = 
				List.of("Spring","Spring Boot","API", "Microservices",
						"AWS", "PCF","Azure","Docker","Kubernetes","Boot");
//		printAllCourses(courses);
//		printCourseWithSpring(courses);
//		printCourseWith4Letters(courses);
//		printCubesOfOddNumbers(numbers);
		printNoOfCharOfCourse(courses);
	}
	
	private static void printNoOfCharOfCourse(List<String> courses) {
		courses.stream()
				.map(course -> course.length())
				.forEach(System.out::println);
	}

	// Exercise - 5
	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number%2 == 1)
				.map(number -> number * number * number)
				.forEach(System.out::println);
	}

	//Exercise - 4
	private static void printCourseWith4Letters(List<String> courses) {
		courses.stream()
				.filter(course -> course.length()>=4)
				.forEach(System.out::println);
	}

	// Exercise - 3
	private static void printCourseWithSpring(List<String> courses) {
		courses.stream()
				.filter(course -> course.contains("Spring"))
				.forEach(System.out::println);
	}

	// Exercise - 2
	private static void printAllCourses(List<String> courses) {
		courses.stream()
				.forEach(System.out::println);
	}
	
	// Exercise - 1
	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number%2 != 0)
				.forEach(System.out::println);
	}
	
	private static void printEvenNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter((number)-> number%2==0)
				.forEach(System.out::println);
	}

}
