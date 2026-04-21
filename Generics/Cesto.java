class Peixe {

    private String nome;
    private int tamanho;

    public Peixe(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {

        return nome;
    }

    public int getTamanho() {

        return tamanho;
    }

}

class Polvo {

    private String nome;
    private int tentaculo;

    public Polvo(String nome, int tentaculo) {
        this.nome = nome;
        this.tentaculo = tentaculo;
    }

    public String getNome() {

        return nome;
    }

    public int getTentaculo() {

        return tentaculo;
    }
}

public class Cesto<T> {

    private T conteudo;

    public void guardar(T coisa) {

        this.conteudo = coisa;

    }

    public T pegar() {

        return conteudo;

    }

    public static void main(String args[]) {

        Cesto<Peixe> cestoDePeixe = new Cesto<>();
        Cesto<Polvo> cestoDePolvo = new Cesto<>();

        cestoDePeixe.guardar(new Peixe("Tilapia", 4));
        cestoDePolvo.guardar(new Polvo("lerypolvo", 5));

        Peixe peixe = cestoDePeixe.pegar();
        Polvo polvo = cestoDePolvo.pegar();

        System.out.println("Este é o polvo chamado:  " + polvo.getNome() + " este polvo tem " + polvo.getTentaculo()
                + " tentaculos");
        System.out.println("Este é o peixe chamado " + peixe.getNome() + " este peixe tem o tamanho: "
                + peixe.getTamanho() + " cm");

    }
}
