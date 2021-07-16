package FOR_SCOOL;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class oneliner {
    public static void main(String args[]){ 
        //! fizz buzz in a single line 
          //  IntStream.rangeClosed(1, 10).forEach(i -> System.out.println((i % 3 == 0) ? ((i % 5 == 0) ? "FizZzBuzz" : "Fizz") : (i % 5 == 0) ? "Buzz" : i));
        //! factorial in a single line 
        //  int n=10;
        //  IntStream.rangeClosed(1, n).filter(i-> n%i==0).forEach(i-> System.out.println(i)); 
        //! string reverse in java in a single line 
        // String name="Aadit singh bagga";
        // IntStream.rangeClosed(0, name.length()-1).forEach(i-> System.out.print(name.charAt((name.length()-1)-i)));
        // ! trying for fibonnica one liner 
        Stream.iterate(new int[]{0,1} , t -> new int[]{t[1],t[0]+t[1]})
        .limit(10)
        .map(t->t[0])
        .forEach(System.out::println);
        /*
          EXPLANATION OF THE ABOVE CODE 
          line wise -> 
          1->  iterate is a function of the stream api which means that the action shall be looped over until a limit 
          new int[]{0,1} are the array of starting of starting values 
          t can be seen here a map related function , acc to the prev values we'll be making new tuple (0,1)(1,1)(1,2)(2,3)
          2-> limit means how many times shld the iterator work 
          3-> map here has been used to take out the first value from all the tuples
          4-> printing the value
        */




      }
}
//ꜱQᴜᴀᴅ