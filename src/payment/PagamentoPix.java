package payment;

import exception.PagamentoException;

public class PagamentoPix implements MetodoPagamento {
    @Override
    public void pagar(double valor) throws PagamentoException {
        if (valor <= 0) throw new PagamentoException("Valor inválido para pagamento.");
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
