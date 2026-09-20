package Strategy;

public class PagamentoBoleto implements FormaPagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento no boleto no valor de R$" + valor);
    }

    @Override
    public String getDescricao() {
        return "Boleto";
    }
}
