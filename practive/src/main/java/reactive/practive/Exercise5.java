package reactive.practive;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

		// Subscribe to a flux using the error and completion hooks
//		Disposable subsribe =  ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
//				err -> System.out.println(err.getMessage()), 
//				() -> System.out.println("Complete"));

		// Subscribe to a flux using an implementation of BaseSubscriber
		ReactiveSources.intNumbersFlux().subscribe(new MySubsriber<>());
		Integer e1 = ReactiveSources.intNumberMono().block();
		System.out.println("Block" + e1);

		System.out.println("Press a key to end");
		System.in.read();
	}

}

class MySubsriber<T> extends BaseSubscriber<T> {
	public void hookOnSubscribe(Subscription subscription) {
		System.out.println("Subscription happend");
		request(1);
	}

	public void hookOnNext(T value) {
		System.out.println(value.toString() + " Recived");
		request(1);
	}
}