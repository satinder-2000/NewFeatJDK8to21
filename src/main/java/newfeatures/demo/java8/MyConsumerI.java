package newfeatures.demo.java8;

/**
 *
 * @author singh
 */
@FunctionalInterface
public interface MyConsumerI {

    public default void accept(Integer t) {
        System.out.println("MyConsumerI impl Value::"+t);
    }
    
    public void someAbstractMethod();
    
    
    
}
