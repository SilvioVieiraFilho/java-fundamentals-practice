import java.util.*;

public class TesteLambda{
        public static void main(String[] args) {


    Set<Integer> numero = new HashSet<>();

    numero.add(1);
    numero.add(2);
    numero.add(3);
    numero.add(4);
    numero.add(5);



    numero.removeIf(n  -> n % 2 == 0 );
        
    System.out.println(numero);


} }