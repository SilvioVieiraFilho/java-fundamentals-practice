import java.util.*;

@FunctionalInterface
interface OperacaoMatematica {

    double executar(double a, double b);
}

public class CalculadoraPersonalizada {

    public static void main(String[] args) {

        OperacaoMatematica obj = (a, b) -> Math.pow(a, b);
        System.out.println(obj.executar(4, 5));

        OperacaoMatematica obj1 = (a, b) -> Math.sqrt(a + b);
        System.out.println(obj1.executar(4, 5));
    }
}
