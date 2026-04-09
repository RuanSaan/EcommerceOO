package model;

import payment.MetodoPagamento;
import exception.PagamentoException;

public class Pedido {
    private Carrinho carrinho;
    private Cliente cliente;

    public Pedido(Carrinho carrinho, Cliente cliente) {
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public void fecharPedido(MetodoPagamento pagamento) throws PagamentoException {
        double total = carrinho.calcularTotal();
        pagamento.pagar(total);
        System.out.println("Pedido fechado com sucesso!");
    }
}
