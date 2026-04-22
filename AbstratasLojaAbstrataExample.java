abstract class Loja {

    public String cnpj;
    public String razao_Social;
    public boolean aberta;

    public Loja(String cnpj, String razao_Social) {
        this.cnpj = cnpj;
        this.razao_Social = razao_Social;
        this.aberta = false;
    }

    public abstract void abrir();

    public abstract void fechar();
}

class LojaComercial extends Loja {

    public LojaComercial(String cnpj, String razao_Social) {
        super(cnpj, razao_Social);
    }

    public void abrir() {
        aberta = true;
        System.out.println("loja aberta");
    }

    public void fechar() {
        aberta = false;
        System.out.println("loja fechada");
    }
}

public class AbstratasLojaAbstrataExample {

    public static void main(String args[]) {

        LojaComercial obj = new LojaComercial("4000000", "455555555");

        obj.abrir();
        obj.fechar();
    }
}
