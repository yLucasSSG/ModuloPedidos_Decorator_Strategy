package Decorator;

import Pedidos.PedidoCalculavel;
import Pedidos.PedidoDecorator;

public class Seguro extends PedidoDecorator {

    public Seguro(PedidoCalculavel pedido) {
        super(pedido);
    }
    public double getTotal(){
        return super.getTotal() + 20;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " + seguro";
    }
}
