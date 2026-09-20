package Strategy;

public interface FormaPagamento {

    void pagar(double valor);

    String getDescricao();
}
