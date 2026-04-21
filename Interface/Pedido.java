interface PedidoRestaurante {

    void adicionarItem(String item, double preco);

    double calcularTotal();
}

public class Pedido implements PedidoRestaurante {

    private double total = 0;

    @Override
    public void adicionarItem(String item, double preco) {
        total += preco; // forma mais limpa
    }

    @Override
    public double calcularTotal() {
        return total;
    }

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();

        pedido1.adicionarItem("batata frita", 20.00);
        pedido2.adicionarItem("hamburguer", 30.00);
        pedido3.adicionarItem("refrigerante", 10.00);

        double calculavalor =
                pedido1.calcularTotal() +
                pedido2.calcularTotal() +
                pedido3.calcularTotal();

        System.out.println("Total: " + calculavalor);
    }
}