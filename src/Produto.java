public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void reporEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void retirarEstoque(int quantidade){
        this.quantidade -= quantidade;
    }
    public void statusDeEstoque(Produto produto){
        if(this.quantidade > 5){
            System.out.println(produto.quantidade + " : estoque baixo");
        } else if (this.quantidade < 15) {
            System.out.println(produto.quantidade + " : estoque alto ");
        }

    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
