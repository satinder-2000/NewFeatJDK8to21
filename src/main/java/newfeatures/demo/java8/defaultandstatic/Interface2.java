package newfeatures.demo.java8.defaultandstatic;
//Source: https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
/**
 *
 * @author singh
 */
@FunctionalInterface
public interface Interface2 {
    
    void method2();
    
    default void log(String str){
        System.out.println("Printing from I2 "+str);
    }
    
}
