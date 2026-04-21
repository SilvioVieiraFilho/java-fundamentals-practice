import java.util.Scanner;
public class DiasNoMes{

    public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
      String mes = s.nextLine();

        int dias = switch (mes) {

            case "Janeiro", "Março", "Maio", "Julho",
                 "Agosto", "Outubro", "Dezembro" -> 31;

            case "Abril", "Junho", "Setembro", "Novembro" -> 30;

            case "Fevereiro" -> 28;

            default -> {
                System.out.println("Mês desconhecido");
                yield -1;
            }
        };

        if (dias != -1) {
            System.out.println("O mês de " + mes + " tem " + dias + " dias.");
        }
    }
}