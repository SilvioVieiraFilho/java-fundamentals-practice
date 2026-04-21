public class ArrayExercicio{

int array[] = {1,2,3,4,5};



public  int acessarElemento(int[] array, int indice){


try{


return array[indice];


}

catch(ArrayIndexOutOfBoundsException e){

    System.out.println("o numero que foi informado esta fora do indice do array"+ e.getMessage());

return -1;
}
}
public static void main(String[] args) {



ArrayExercicio a = new ArrayExercicio();


System.out.println("O numero que foi informado é valido : "+a.acessarElemento(a.array,1));//valido

System.out.println("o numero que foi informado é invalido"+a.acessarElemento(a.array,8));//invalido



}
}
