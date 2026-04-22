import java.io.*;

public class ManipulacaoDeArquivos {

    public void escreverNoArquivo(String nomeDoArquivo, String conteudo) {
        try (FileWriter writer = new FileWriter(nomeDoArquivo)) {
            writer.write(conteudo);
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

    public void lerDoArquivo(String nomeArquivo) {

        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }

            // imprime tudo de uma vez
            System.out.println(conteudo.toString());

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

        ManipulacaoDeArquivos m = new ManipulacaoDeArquivos();

        m.escreverNoArquivo(
                "C:\\Users\\nino_\\OneDrive\\Documentos\\Projetos\\arquivo.txt",
                "Ola mundo");

        m.lerDoArquivo(
                "C:\\Users\\nino_\\OneDrive\\Documentos\\Projetos\\arquivo.txt");
    }
}
