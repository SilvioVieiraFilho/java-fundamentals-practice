public class CestoGenerico<T> {

    private T conteudo;

    public void guardar(T coisa) {
        this.conteudo = coisa;
    }

    public T pegar() {
        return conteudo;
    }

    public static void main(String args[]) {

        CestoGenerico<Peixe> cestoDePeixe = new CestoGenerico<>();
        CestoGenerico<Polvo> cestoDePolvo = new CestoGenerico<>();

        cestoDePeixe.guardar(new Peixe("Tilapia", 4));
        cestoDePolvo.guardar(new Polvo("lerypolvo", 5));

        Peixe peixe = cestoDePeixe.pegar();
        Polvo polvo = cestoDePolvo.pegar();

        System.out.println("Este é o polvo chamado: " + polvo.getNome()
                + " este polvo tem " + polvo.getTentaculo() + " tentaculos");

        System.out.println("Este é o peixe chamado " + peixe.getNome()
                + " este
