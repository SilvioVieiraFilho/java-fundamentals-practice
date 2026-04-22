
import java.nio.*;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulacaoArquivos {

    public void escreverNoArquivo(String nomeArquivo, String conteudo) {

        try {
            Path path = Paths.get(nomeArquivo);

            Files.write(path, conteudo.getBytes());

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

    public String lerDoArquivo(String nomeArquivo) {

        Path path = Paths.get(nomeArquivo);

        try {
            byte[] bytes = Files.readAllBytes(path);

            System.out.println(new String(bytes));
            return new String(bytes);

        } catch (IOException e) {

            System.out.println("Problemas de IO: " + e.getMessage());
            return "";
        }
    }

    public static void main(String args[]) {

        ManipulacaoArquivos obj = new ManipulacaoArquivos();
        obj.escreverNoArquivo("Arquivo.txt", "Ola mundo");
        obj.lerDoArquivo("Arquivo.txt");
    }
}
