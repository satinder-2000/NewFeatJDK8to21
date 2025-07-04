package newfeatures.demo.java8.stream;
//Source: https://www.digitalocean.com/community/tutorials/java-8-stream

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author singh
 */
public class SumIterator {
    
    public static void main(String... args){
        List<Integer> myList=new ArrayList<>();
        for (int i=0; i<100; i++) myList.add(i);
        System.out.println("Traditional approach result: "+sumIterator(myList));
        System.out.println("Stream approach result: "+sumStream(myList));
    
    
    }
    
    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }
    
    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
    
}
