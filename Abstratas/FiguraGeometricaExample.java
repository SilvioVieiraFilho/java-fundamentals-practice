abstract class FiguraGeometrica {

    abstract void calcularArea();

    abstract void calcularPerimetro();
}

public class Retangulo extends FiguraGeometrica {

    private int altura;
    private int base;

    public Retangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void calcularArea(int altura, int base) {
        int area = altura * base;
    }

    public void calcularPerimetro(int altura1, int base1) {
        int perimetro = 2 * (altura + base);
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        retur base;
    }
}

public class FiguraGeometricaExample {

    public static void main(String args[]) {

        Retangulo r = new Retangulo(15, 4);

        System.out.println(r.calcularArea(r.getAltura(), r.getBase()));

        System.out.println(r.calcularPerimetro(r.getAltura(), r.getBase()));
    }
}
