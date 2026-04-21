import java.util.Scanner;
public class Exercicio{
public static void main (String args[]){

Scanner s = new Scanner(System.in);


System.out.println("escreva seu nivel");
int nivel = s.nextInt();

switch(nivel){

case 1: System.out.println("Muito satisfeito");
break;
case 2: System.out.println("Insatisfeito");
break;

case 3: System.out.println("neutro");
break;

case 4:  System.out.println("Satisfeito");
break;

case 5: System.out.println("muito satisfeito");
break;

default:  System.out.println("opção invalida"); 





}



}
} 