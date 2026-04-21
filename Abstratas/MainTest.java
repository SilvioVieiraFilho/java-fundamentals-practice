abstract class FiguraGeometrica {

   abstract int calcularArea();

   abstract int calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {

   private int altura;
   private int base;

   public Retangulo(int altura, int base) {

      this.altura = altura;
      this.base = base;

   }

   public int calcularArea() {

      int area = altura * base;

      return area;

   }

   public int calcularPerimetro() {

      int perimetro = 2 * (altura + base);

      return perimetro;

   }

   public int getAltura() {

      return altura;
   }

   public int getBase() {

      return base;

   }
}

public class MainTest {
   public static void main(String args[]) {

      Retangulo r = new Retangulo(15, 4);

      System.out.println("Area do retangulo é " + r.calcularArea());

      System.out.println("Perimetro do retangulo é " + r.calcularPerimetro());

   }
}