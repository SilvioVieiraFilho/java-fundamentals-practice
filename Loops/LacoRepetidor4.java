public class LacoRepetidor4 {

    public static void main(String[] args) {

        int numero = 10; // valor definido
        int contador = 1;
        int soma = 0;

        do {
            soma += contador; // acumula
            contador++;       // incrementa

        } while (contador <= numero);

        System.out.println("A soma de 1 até " + numero + " é: " + soma);
    }
}