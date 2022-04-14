package implantacao;

import beans.Produto;
import util.EntradaTela;

public class ExecutarProduto3 {

    public static void main(String[] args) {

        Produto p1 = new Produto(EntradaTela.texto("Informe o produto"),
                EntradaTela.valor("Informe o valor do produto"),
                EntradaTela.texto("Informe a marca"),
                EntradaTela.logico("O produto está em promoção?")
        );
        EntradaTela.console(p1.detalhes());
        EntradaTela.show(p1.detalhes());
    }
}
