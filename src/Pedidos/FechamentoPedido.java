package Pedidos;

import Decorator.Desconto10;
import Decorator.Desconto20;
import Strategy.FormaPagamento;

public class FechamentoPedido {

    private PedidoCalculavel pedido;
    private FormaPagamento formaPagamento;
    private Boolean cupomAplicado = false;

    public FechamentoPedido(PedidoCalculavel pedido, FormaPagamento formaPagamento) {
        this.pedido = pedido;
        this.formaPagamento = formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void fecharPedido(){
        formaPagamento.pagar(pedido.getTotal());
    }

    public String exibirResumo(){
        return pedido.getDescricao() + " | Total: R$ " + pedido.getTotal();
    }

    public void AplicarCupom(int cupom){
        if(cupomAplicado){
            System.out.println("Já existe um cupom aplicado");
            return;
        }

        if (cupom == 10) {
            this.pedido = new Desconto10(this.pedido);
            System.out.println("Desconto 10% aplicado");
        } else if (cupom == 20) {
            System.out.println("Desconto 20% aplicado");
            this.pedido = new Desconto20(this.pedido);

        } else{
            System.out.println("Cupom inválido");
            return;
        }

        cupomAplicado = true;
    }


}
