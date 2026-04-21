
import java.util.*;

public class MapExercise {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();

        map.put("001", 2);
        map.put("002", 2);
        map.put("003", 4);

        System.out.println("mostrar os valores" + map);

        System.out.println("me mostra a quantidade desse codigo:" + map.get("001"));

        map.remove("001");

        System.out.println("mostrar os valores" + map);

    }
}