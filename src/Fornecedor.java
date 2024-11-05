import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome = "caio";
    private String contato = "79";
    private List<Produto> produtos;

    public Fornecedor() {
        produtos = new ArrayList<Produto>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirProdutos(){
        System.out.println(this.nome);
        System.out.println(this.contato);
        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }

}
