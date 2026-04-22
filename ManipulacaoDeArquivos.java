
import java.io.*;

public class ManipulacaoDeArquivos {

    public void escreverNoArquivo(String nomeDoarquivo, String conteudo) {

        try {

            // Escrevendo em um arquivo
            FileWriter writer = new FileWriter(nomeDoarquivo);

            writer.write(conteudo);

            writer.close();

        } catch (IOException e) {

            System.out.println("Problemas de IO: " + e.getMessage());
        }

    }

    public void lerDoArquivo(String nomeArquivo) {

        try {

            FileReader reader = new FileReader(nomeArquivo);

            int data = reader.read();

            while (data != -1) {

                System.out.print((char) data);

                data = reader.read();
            }

            reader.close();
        } catch (IOException e) {

            System.out.println("Problemas de IO: " + e.getMessage());
        }

    }

    public static void main(String args[]) {

        ManipulacaoDeArquivos m = new ManipulacaoDeArquivos();

        m.escreverNoArquivo("C:\\Users\\nino_\\OneDrive\\Documentos\\Projetos\\arquivo.txt", "Ola mundo");
        m.lerDoArquivo("C:\\Users\\nino_\\OneDrive\\Documentos\\Projetos\\arquivo.txt");

    }

}