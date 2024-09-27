package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		Predicate<Integer> isEvenPredicate = x-> x%2==0;
		
		Function<Integer, Integer> squareFunction = x-> x*x;
		
		Consumer<Integer> sysOutConsumer = System.out::println;
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
//		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = (x)-> 4*x;
//		System.out.println(unaryOperator.apply(20));
		
		BiPredicate<Integer, String> biPredicate = (num, str) -> {
			return num<10 && str.length()>5;
		};
//		System.out.println(biPredicate.test(45, "Avishek"));
		
		BiFunction<Integer, String, String> biFunction = (num,str) -> {
			return num + " --> "+ str;
		};
//		System.out.println(biFunction.apply(14, "Avishek"));
		
		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept(345, "Avisehek");
	}
}
