package Decorator;

import Pedidos.PedidoCalculavel;
import Pedidos.PedidoDecorator;

public class Desconto10 extends PedidoDecorator {

    public Desconto10(PedidoCalculavel pedido){
        super(pedido);
    }

    @Override
    public double getTotal(){
        return super.getTotal() * 0.90;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " + cupom de desconto de 10%";
    }
}
