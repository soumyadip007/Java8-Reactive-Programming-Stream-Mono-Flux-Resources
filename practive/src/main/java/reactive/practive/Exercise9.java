package reactive.practive;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.reactivestreams.Subscription;

import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class Exercise9 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.intNumbersFlux()

//		ReactiveSources.intNumbersFluxWithException().subscribe(number -> System.out.println(number),
//				err -> System.out.println(err.getMessage()), () -> System.out.println("Complete"));

//		ReactiveSources.intNumbersFluxWithException().doOnError(e -> System.out.println("Error " + e.getMessage()))
//				.subscribe(number -> System.out.println(number), err -> System.out.println(err.getMessage()));

//		ReactiveSources.intNumbersFluxWithException()
//				// It'll continue
//				.onErrorContinue((e, t) -> System.out.println("Error " + e.getMessage()))
//				.subscribe(number -> System.out.println(number));

		ReactiveSources.intNumbersFluxWithException()
				// Fallback flask
				.onErrorResume(err -> Flux.just(-1, -2)).subscribe(number -> System.out.println(number));

		System.out.println("Press a key to end");
		System.in.read();
	}

}
