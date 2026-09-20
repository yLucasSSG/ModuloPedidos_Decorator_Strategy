package Decorator;

import Pedidos.PedidoDecorator;
import Pedidos.PedidoCalculavel;

public class Desconto20 extends PedidoDecorator {

    public Desconto20(PedidoCalculavel pedido){
        super(pedido);
    }

    @Override
    public double getTotal(){
        return super.getTotal() * 0.80;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " + cupom de desconto de 20%";
    }
}
