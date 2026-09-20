package Decorator;

import Pedidos.PedidoDecorator;
import Pedidos.PedidoCalculavel;

public class EmbalagemPresente extends PedidoDecorator {

    public EmbalagemPresente(PedidoCalculavel pedido) {
        super(pedido);
    }

    @Override
    public double getTotal(){
        return super.getTotal() + 5;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " + embalagem de presente";
    }
}
