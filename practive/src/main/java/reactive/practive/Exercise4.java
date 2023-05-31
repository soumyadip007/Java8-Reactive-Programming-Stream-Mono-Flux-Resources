package reactive.practive;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) throws IOException {


        // Use ReactiveSources.intNumberMono()

		System.out.println("Print the value from intNumberMono when it emits");
        // TODO: Write code here
		ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number), 
													err-> System.out.println(err.getMessage()),
													()-> System.out.println("Complete")
		);

		
		
		
		System.out.println(" Get the value from the Mono into an integer variable");
        // TODO: Write code here
		Optional<Integer> e = ReactiveSources.intNumberMono().blockOptional();
		System.out.println("Optional"+e);
//		Integer e1 = ReactiveSources.intNumberMono().block();
//		System.out.println("Block"+e1);
		
        System.out.println("Press a key to end");
        System.in.read();
	}
}