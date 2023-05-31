package reactive.practive;

import java.util.stream.Stream;
import java.io.*;
import java.util.*;

public class Exercise2 {

    public static void main(String[] args) throws IOException {
        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        System.out.println("all numbers in the ReactiveSources.intNumbersFlux stream");
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(e-> System.out.println(e));
        
        	
        
        System.out.println("Print all users in the ReactiveSources.userFlux stream");
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(e-> System.out.println(e));
        
        
        
        System.out.println("Press a key");
        System.in.read();
  }
}