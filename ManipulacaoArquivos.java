import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulacaoArquivos {

    public void escreverNoArquivo(String nomeArquivo, String conteudo) {
        try {
            Path path = Path.of(nomeArquivo);

            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
            System.out.println("Arquivo criado e texto escrito com sucesso!");

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

    public String lerDoArquivo(String nomeArquivo) {
        Path path = Path.of(nomeArquivo);

        try {
            byte[] bytes = Files.readAllBytes(path);

            String conteudo = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(conteudo);

            return conteudo;

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
            return "";
        }
    }

    public static void main(String[] args) {
        ManipulacaoArquivos obj = new ManipulacaoArquivos();

        obj.escreverNoArquivo("Arquivo.txt", "Ola mundo");
        obj.lerDoArquivo("Arquivo.txt");
    }
}