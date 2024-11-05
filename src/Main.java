public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("01", "arroz", 5, 10);
        Produto produto2 = new Produto("02", "feijao", 10, 15);
        Produto produto3 = new Produto("03", "macarrao", 15, 22);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.addProduto(produto1);
        fornecedor.addProduto(produto2);
        fornecedor.addProduto(produto3);

        fornecedor.exibirProdutos();

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        System.out.println("___________________");

        estoque.consultarProduto("01");

        System.out.println("___________________");

        estoque.atualizarQuantidade("arroz", 10);


        estoque.listarProdutos();

        System.out.println("___________________");

        estoque.gerarRelatorioEstorquebaixo(15);

        System.out.println("----------------------");

        estoque.removerProduto("02");

        estoque.listarProdutos();


    }
}