package newfeatures.demo.java8;
//Source: https://www.w3schools.com/java/java_lambda.asp

import java.util.ArrayList;
import java.util.function.Consumer;


/**
 *
 * @author singh
 */
public class LambdaExpressionDemo {
    
    public static void main(String[] args) {
        //Example 1: Lambda expressions are usually passed as parameters to a function:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        
        numbers.forEach((n) -> {
            System.out.println("I am number: " + n);
        });
        
        //Example2: Use Java's Consumer interface to store a lambda expression in a variable:
        Consumer<Integer> method= (n) -> {System.out.println("From Customer Interface: "+n);};
        numbers.forEach(method);
        
        //Example 3: Create a method which takes a lambda expression as a parameter:
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask =(s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
                
        
    }
    
    
    public static void printFormatted(String str, StringFunction format){
    String result= format.run(str);
    System.out.println(result);
}
    
}

interface StringFunction{
    String run(String str);
}


