package InterfacesFuncionales;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    
    public static void main(String[] args) {
       
        // sin parametros
        MyFunctionalInterface demo = () -> "Hello ";
       // Runnable asd = () -> System.out.println("xD");
        //funcion(() ->"return desde interfax funcional");
        MyFunctionalInterface a = () -> "xD";
       System.out.println(a.doSomething());
        MyFunctionalInterface as= hacer();
        System.out.println(as.doSomething());
        
        //con parametros 
        // MyFunctionalInterface demo = (String x) -> System.out.println("Hello ");
 
        List jedis=List.of( "Yoda", "windu","Anakin","Luke","Rey");
         
        jedis.forEach(x -> System.out.println(x));
        jedis.forEach(System.out::println);

        System.out.println("********");
        List jedis2=List.of( "Anakin", "Leia","Luke","Rey");
        Predicate<String> isAjedi =x->x.equals("Rey");
        jedis2.stream().filter(isAjedi);
        jedis2.

    }
    public static void funcion (MyFunctionalInterface interfase){
        System.out.println("metodo con interfaz funcional como parametro");
    } 
    public static MyFunctionalInterface hacer(){
        return ()->"return del metodo tipo funcional xddddd";
    }
}
