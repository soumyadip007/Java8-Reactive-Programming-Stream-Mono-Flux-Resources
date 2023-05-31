package reactive.practive;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.reactivestreams.Subscription;

import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;

public class Exercise7 {

	public static void main(String[] args) throws IOException {

//		Object[] data= ReactiveSources.intNumbersFlux().log().toStream().toArray();
//		System.out.println(Arrays.toString(data));
		// data.forEach(System.out::println);

		// Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

		// System.out.println("Print all values from intNumbersFlux that's greater than
		// 5");
		// TODO: Write code here
		// ReactiveSources.intNumbersFlux().filter(e -> e
		// <5).log().subscribe(System.out::println);

		// Print 10 times each value from intNumbersFlux that's greater than 5
		// ReactiveSources.intNumbersFlux().filter(e -> e <5).log().map(e -> e *
		// 100).log().subscribe(System.out::println);

		// Print 10 times each value from intNumbersFlux for the first 3 numbers emitted
		// that's greater than 5
		// ReactiveSources.intNumbersFlux().filter(e -> e <5).log().map(e -> e *
		// 100).take(3).log().subscribe(System.out::println);

		// Print each value from intNumbersFlux that's greater than 20. Print -1 if no
		// elements are found
		// ReactiveSources.intNumbersFlux().filter(e -> e >
		// 20).defaultIfEmpty(-1).subscribe(System.out::println);

		// Switch ints from intNumbersFlux to the right user from userFlux
		//.        anyMatch(i -> i == user.getId())).
//		 ReactiveSources.intNumbersFlux().flatMap(e -> ReactiveSources.userFlux().filter(user -> user.getId() == e))
//		 .take(1).subscribe(System.out::println);


		// Print only distinct numbers from intNumbersFluxWithRepeat
		// ReactiveSources.intNumbersFluxWithRepeat().distinct().log().subscribe();

		// Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
		 ReactiveSources.intNumbersFluxWithRepeat().distinctUntilChanged().log().subscribe();

		System.out.println("Press a key to end");
		System.in.read();
	}

}
