
import java.util.*;

public class ListExercise {

    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("Harry potter");
        list.add("O senhor dos aneis");
        list.add("crepusculo");

        System.out.println("mostrar a lista de filmes" + list);

        System.out.println("o filme do Harry potter esta na lista ? " + "\n" + list.contains("Harry potter"));

    }
}