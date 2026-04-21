public class ExemploNullPointerExceptionInteger{

    Integer numero = null;

    public static void main(String args[]) {

        ExemploNullPointerExceptionInteger obj = new ExemploNullPointerExceptionInteger();

        try {

            System.out.println(obj.numero.toString());

        } catch (NullPointerException e) {

            System.out.println("Variável não inicializada e por isso retornou null Detalhe do erro : "+ e.getMessage());

        } finally {

            System.out.println("Encerrando o sistema");
        }
    }
}