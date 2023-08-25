package InterfacesFuncionales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        //listas mutables
        System.out.println("********");
        List jedis2=new ArrayList<>(Arrays.asList( "Anakin", "Leia","Luke","Rey"));
        Predicate<String> isAnotjedi =x->x.equals("Rey");
        //Predicate<String> isAnotjedi =x->!x.equals("Rey"); Negacion para Lista 3
        //List jedis3 =jedis2.stream().filter(isAnotjedi).toList();
        //jedis3.stream().forEach(System.out::println);
        //************ */
        jedis2.removeIf(isAnotjedi);
        jedis2.forEach(System.out::println);//error porque List.of y Array.list son inmutables
        System.out.println("******** map reduce");
        //Listas inmutabes  
        List newjedis=List.of( "Anakin", "Leia","Luke","Rey");
        var filterJedi= newjedis.stream()
                        .filter(x->!x.equals("Rey"))
                        .peek(System.out::println)
                        .map(z->z.toString().toUpperCase())
                        .peek(System.out::println)
                        .findFirst();
                        //.collect(Collectors.toList());
                        System.out.println(Objects.isNull(filterJedi));
                        System.out.println(filterJedi.get());
    
    }
    public static void funcion (MyFunctionalInterface interfase){
        System.out.println("metodo con interfaz funcional como parametro");
    } 
    public static MyFunctionalInterface hacer(){
        return ()->"return del metodo tipo funcional xddddd";
    }
}
