// Remova a palavra 'public' da interface se ela estiver no mesmo arquivo da classe public
interface ProdutoMarket {
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    String getNome();
    int getQuantidade();
}

public class ProdutoImpl implements ProdutoMarket {
    public String nome;
    public int quantidade;

    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente!");
        }
    }

    public static void main(String[] args) {
        // Agora o tipo Produto (interface) será compatível com ProdutoImpl
        ProdutoMarket produto = new ProdutoImpl("Arroz", 50);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Estoque inicial: " + produto.getQuantidade());
        
        produto.adicionarQuantidade(20);
        System.out.println("Após adicionar: " + produto.getQuantidade());

        produto.removerQuantidade(15);
        System.out.println("Após remover: " + produto.getQuantidade());
    }
}