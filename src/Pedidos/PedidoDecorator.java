package Pedidos;

public abstract class PedidoDecorator implements PedidoCalculavel {

    protected PedidoCalculavel pedido;

    public PedidoDecorator(PedidoCalculavel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getTotal(){
        return pedido.getTotal();
    }

    @Override
    public String getDescricao(){
        return pedido.getDescricao();
    }
}
