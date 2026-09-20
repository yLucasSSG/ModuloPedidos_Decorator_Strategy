package Pedidos;

public class PedidoBase implements PedidoCalculavel
{
    private double valorBase;

    public PedidoBase(double valorBase)
    {
        this.valorBase = valorBase;
    }

    @Override
    public double getTotal(){
        return valorBase;
    }

    @Override
    public String getDescricao(){
        return ("Pedido");
    }


}
