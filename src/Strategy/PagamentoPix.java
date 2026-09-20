package Strategy;

public class PagamentoPix implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX no valor de R$" + valor);
    }

    @Override
    public String getDescricao() {
        return "PIX";
    }
}
