package Strategy;

public class PagamentoCartao implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no cartão no valor de R$" + valor);
    }

    @Override
    public String getDescricao() {
        return "Cartão";
    }

}
