package newfeatures.demo.java8.stream;
//Source: https://www.digitalocean.com/community/tutorials/java-8-features-with-examples

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 *
 * @author singh
 */
public class StreamExample {
    
    public static void main(String... args){
        List<Integer> myList=new ArrayList<>();
        for (int i=0; i<100; i++) myList.add(i);
        
        Stream<Integer> sequentialStream=myList.stream();
        Stream<Integer> parallelStream=myList.parallelStream();
        
        //using lambda with Stream API, filter example
        Stream<Integer> highNums=parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High nums parallel is "+p));
        
        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High nums sequential is "+p));
        
    }
    
}
