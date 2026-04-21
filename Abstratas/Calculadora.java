abstract class Operacao{

    abstract double calcular(double n1,double n2);
    


}

 class Soma extends Operacao{

public double calcular(double n1 , double n2 ){

  double soma = n1 + n2;
  


  return soma;
}

}

 class Subtracao extends Operacao{

    public  double calcular(double n1 , double n2 ){

  double Subtracao = n1 - n2;
  
  

  return Subtracao;
}
}

 class Divisao  extends Operacao{

public double calcular(double n1 , double n2 ){

  double divisao  = n1 / n2;
  
  if(n1 == 0 || n2 == 0){

throw new ArithmeticException("Não pode dividir por zero");

  

  }

  return divisao;


}
}


 class Multiplicacao extends Operacao{

public double calcular(double n1 , double n2 ){

  double multiplicacao = n1 * n2;
  
  

  return multiplicacao;

}
}


public class Calculadora{
public static void main (String args[]){


Soma soma = new Soma();
Subtracao subtracao = new Subtracao();
Multiplicacao multiplicacao = new Multiplicacao();
Divisao divisao = new Divisao();

System.out.println("Valor da soma é: "+soma.calcular(4,4));
System.out.println("Valor da subtracao é: "+ subtracao.calcular(5,2));
System.out.println("Valor da multiplicacao é: "+ multiplicacao.calcular(5, 5));
System.out.println("Valor da divisão é: "+ divisao.calcular(2, 2));

}



}