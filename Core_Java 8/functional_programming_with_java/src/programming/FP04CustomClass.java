package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course() {
		super();
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", noOfStudents=" + noOfStudents + "]";
	}
	
}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring","Framework",96, 2000),
				new Course("SpringBoot","Framework",96, 3000),
				new Course("Hibernate","Framework",96, 6000),
				new Course("API","Microservices",96, 1000),
				new Course("Microservices","Microservices",96, 7000),
				new Course("fullStack","FullStack",96, 234),
				new Course("AWS","Cloud",96, 4564),
				new Course("Docker","Cloud",96, 327),
				new Course("Kubernetes","Cloud",96, 245)
				);
		
		Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore()>95;
		Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore()>90;
		
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95));
		System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan95));
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90));
		
		//Sorting
		
		Comparator<Course> compareByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		System.out.println(courses.stream()
							.sorted(compareByNoOfStudents)
							.collect(Collectors.toList()));
		
		Comparator<Course> compareByNoOfStudentsDec = Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream()
							.sorted(compareByNoOfStudentsDec)
							.collect(Collectors.toList()));
		
	}

}
