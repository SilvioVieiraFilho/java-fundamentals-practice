import java.util.*;

public class SetExercise {

    public static void main(String args[]) {

        Set<Integer> set1 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("imprima a lista inteira " + set1);

        boolean numeroverdadeiro = set1.contains(3);

        System.out.println(numeroverdadeiro);

        set1.remove(2);
        System.out.println("imprima a lista pós remoção" + set1);

    }

}