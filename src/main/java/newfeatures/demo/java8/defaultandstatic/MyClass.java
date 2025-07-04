package newfeatures.demo.java8.defaultandstatic;
//Source: https://www.digitalocean.com/community/tutorials/java-8-features-with-examples

/**
 *
 * @author singh
 */
public class MyClass implements Interface1, Interface2 {
    
    @Override
    public void method2(){}
    
    @Override
    public void method1(String str){}
    
    
    @Override
    public void log(String str){
        System.out.println("Printing from MyClass: "+str);
        Interface1.print(str);
    }
    
    public static void main(String ... args){
        MyClass myClass=new MyClass();
        myClass.log("Hello Jee!!");
    }
    
}
