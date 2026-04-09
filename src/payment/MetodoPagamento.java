package payment;

import exception.PagamentoException;

public interface MetodoPagamento {
    void pagar(double valor) throws PagamentoException;
}
