package main;

import model.*;
import payment.*;
import exception.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ruan");
        Carrinho carrinho = new Carrinho();

        Produto camisa = new Camisa("Java Mascot T-Shirt", 50.0, "G");
        carrinho.adicionarProduto(camisa);

        Pedido pedido = new Pedido(carrinho, cliente);

        MetodoPagamento pagamento = new PagamentoPix();

        try {
            System.out.println(camisa);
            pedido.fecharPedido(pagamento);
        } catch (PagamentoException e) {
            System.out.println("Erro no pagamento: " + e.getMessage());
        }
    }
}
