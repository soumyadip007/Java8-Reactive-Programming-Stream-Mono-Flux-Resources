package reactive.practive;

import java.util.stream.Stream;
import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().forEach(num -> System.out.println(num));

      System.out.println("Print all numbers in the intNumbersStream stream");
     
        // Print all numbers in the intNumbersStream stream
        Exercise1.intNumbersStream().forEach(num -> System.out.println(num));

      System.out.println("numbers from intNumbersStream that are less than 5");
        // TODO: Write code here
         Exercise1.intNumbersStream().filter(num ->{
          return  (num<5)?  true :  false;
         }).forEach(num -> System.out.println(num));;
        Stream<Integer> s = Exercise1.intNumbersStream().filter(num ->{
          return  (num<5)?  true :  false;
         });
        s.forEach(num -> System.out.println(num));

          System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        // TODO: Write code here
         Exercise1.intNumbersStream().filter(num -> num > 5)
                            .skip(3)
                            .limit(3)
                            .forEach(num -> System.out.println(num));


        System.out.println("Print the first number in intNumbersStream that's greater than 5.");
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer p = Exercise1.intNumbersStream().filter(num -> num > 5).findFirst().orElse(-11);
        System.out.println(p);

        // Print first names of all users in userStream
        // TODO: Write code here
        Exercise1.userStream().map(user -> user.getFirstName())
                            .forEach(firstName -> System.out.println(firstName));


        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
       
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        Exercise1.intNumbersStream().flatMap(id ->  Exercise1.userStream()
                                                            .filter(user -> user.getId() == id))
                                                            .forEach(userId -> System.out.println(userId));
        
        System.out.println("Print first names in userStream for users that have IDs from number stream - User stream");
        
        
        Exercise1.userStream().flatMap(user ->  Exercise1.intNumbersStream().
                                                            filter(num -> user.getId() == num)).
                                                            forEach(userId -> System.out.println(userId));

        System.out.println("Print first names in userStream for users that have IDs from number stream - AnyMatch");
        
        
        Exercise1.userStream().filter(user ->  Exercise1.intNumbersStream().
                                                            anyMatch(i -> i == user.getId())).
                                                            forEach(System.out::println);


  }


    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> intNumbersStream() {
        return Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<User> userStream() {
        return Stream.of(
                new User(1, "Lionel", "Messi"),
                new User(2, "Cristiano", "Ronaldo"),
                new User(2, "Diego", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "Jürgen", "Klinsmann"),
                new User(6, "Gareth", "Bale")
        );
    }

}
