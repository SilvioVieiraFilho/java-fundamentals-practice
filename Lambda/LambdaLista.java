import java.util.*;

public class LambdaLista{

public static void main (String args[]){


List<String> lista = new ArrayList<>();

lista.add("Banana");
lista.add("uva");
lista.add("abacate");
lista.add("mamao");
lista.add("melao");

System.out.println(lista);


lista.removeIf(

s->s.length() > 5);

System.out.println("removendo frutas que contem mais de 5 caracteres");


lista.add(0,"abacaxi");
System.out.println("Exiba o valor do indicie"+lista.get(0));


lista.forEach(System.out::println);



}
}