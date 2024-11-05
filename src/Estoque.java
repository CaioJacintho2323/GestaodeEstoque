
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    Map<String, Produto> estoques;

    public Estoque() {
        estoques = new HashMap<String, Produto>();
    }

    public void adicionarProduto(Produto produto) {
        estoques.put(produto.getCodigo(), produto);
    }

    public void atualizarQuantidade(String nome, int quantidade) {
        for (Produto produto : estoques.values()) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
            }
        }
    }

    public void removerProduto(String codigo) {
        if (estoques.containsKey(codigo)) {
            estoques.remove(codigo);
            System.out.println(codigo + " removido.");
        }
    }

    public void consultarProduto(String codigo) {
        for (Produto produto : estoques.values()) {
            if (!produto.getCodigo().equals(codigo)) {
                System.out.println("nao existe produto");
            } else {
                System.out.println(produto.getNome());
                break;
            }
        }
    }

    public void listarProdutos() {
        for (Produto produto : estoques.values()) {
            System.out.println(produto);
        }
    }

    public void gerarRelatorioEstorquebaixo(int quantidadeLimite) {
        for (Produto produto : estoques.values()) {
            if (produto.getQuantidade() >= quantidadeLimite) {
                System.out.print(produto);
                System.out.println(" " + "estoque alto");
            } else {
                System.out.print(produto);
                System.out.println(" " + "estoque baixo");
            }
        }
    }
}
