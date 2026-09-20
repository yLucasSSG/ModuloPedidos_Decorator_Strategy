package Decorator;

import Pedidos.PedidoDecorator;
import Pedidos.PedidoCalculavel;

public class Frete extends PedidoDecorator {

    public Frete(PedidoCalculavel pedido) {
        super(pedido);
    }

    @Override
    public double getTotal(){
        return super.getTotal() + 10;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " + frete";
    }

}
