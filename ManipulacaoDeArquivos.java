
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

        StringBuilder conteudo = new StringBuilder();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));

            String data;

            while ((data = reader.readLine()) != null) {

                System.out.println(conteudo.append(data).append("\n"));

            }

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