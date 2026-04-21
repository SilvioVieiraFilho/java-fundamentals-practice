public class LacoRepetidor5 {

    public static void main(String[] args) {

    int codigoDeSaida = 9; 
for(int codigoCarteirinha  = 1;  codigoCarteirinha  < 10 ; codigoCarteirinha ++ ){



if(codigoCarteirinha == codigoDeSaida) {

System.out.println("Encerrando execução no código: " + codigoCarteirinha);
break;


}

if(codigoCarteirinha == 3 ||codigoCarteirinha == 7 || codigoCarteirinha == 10  ){

System.out.println("o código "+  codigoCarteirinha + " foi aceito");

continue;


} 

	
System.out.println("o codigo " +codigoCarteirinha +  " não foi aceito no hospital santa clara"); 
    }
}
} 