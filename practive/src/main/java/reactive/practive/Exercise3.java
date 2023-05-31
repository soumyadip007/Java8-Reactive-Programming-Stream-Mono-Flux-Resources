package reactive.practive;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.intNumbersFlux()
		
		LinkedList<Integer> obj=new LinkedList();
;		
		// Get all numbers in the ReactiveSources.intNumbersFlux stream
		// into a List and print the list and its size
		// TODO: Write code here
//		ReactiveSources.intNumbersFlux().subscribe(e -> {
//			obj.add(e);
//			System.out.println(obj.toString());
//		});
		
//		Object[] data= ReactiveSources.intNumbersFlux().toStream().toArray();
//		System.out.println(Arrays.toString(data));
//		//data.forEach(System.out::println);
		
//		Stream<Integer> data1= ReactiveSources.intNumbersFlux().toStream();
//		List<Integer> list = data1.collect(Collectors.toList());
//		System.out.println(list);

		Stream<Integer> data1= ReactiveSources.intNumbersFlux().toStream();
		System.out.println("Done");
		System.out.println(data1.toArray());
		
		System.out.println("Start");

		Stream<Integer> data2= ReactiveSources.intNumbersFlux().toStream();
		data2.forEach(System.out::println);
		
		
		System.out.println("Press a key to end");
		System.in.read();
	}
}