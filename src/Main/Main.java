package Main;

import Decorator.*;
import Pedidos.*;
import Strategy.*;

public class Main{
    public static void main(String[] args){

        // Pedidos base, sem adicionais (decorator). Formas de pagamento utilizam Strategy:

        // Pedido Base 1, sem adicionais. Pagamento PIX.
        PedidoCalculavel pedidoBase1 = new PedidoBase(200);
        System.out.println(pedidoBase1.getDescricao() + " " + pedidoBase1.getTotal());
        System.out.println();
        FechamentoPedido fechamentoPedido1 = new FechamentoPedido(pedidoBase1, new PagamentoPix());
        System.out.println(fechamentoPedido1.exibirResumo());
        fechamentoPedido1.fecharPedido();
        System.out.println();


        System.out.println("----------------");

        // Pedido Base 2, sem adicionais. Pagamento Cartão.
        PedidoCalculavel pedidoBase2 = new PedidoBase(100);
        System.out.println("\n" + pedidoBase2.getDescricao() + " " + pedidoBase2.getTotal());
        System.out.println();
        FechamentoPedido fechamentoPedido2 = new FechamentoPedido(pedidoBase2, new PagamentoCartao());
        System.out.println(fechamentoPedido2.exibirResumo());
        fechamentoPedido2.fecharPedido();
        System.out.println();

        System.out.println("----------------");

        // Pedido Base 3, sem adicionais. Pagamento Boleto.
        PedidoCalculavel pedidoBase3 = new PedidoBase(300);
        System.out.println("\n" + pedidoBase3.getDescricao() + " " + pedidoBase3.getTotal());
        System.out.println();
        FechamentoPedido fechamentoPedido3 = new FechamentoPedido(pedidoBase3, new PagamentoBoleto());
        System.out.println(fechamentoPedido3.exibirResumo());
        fechamentoPedido3.fecharPedido();
        System.out.println();

        System.out.println("----------------");

        // Pedido com adicionais (decorator) + formas de pagamento (Strategy):
        PedidoCalculavel pedidoBase4 = new PedidoBase(650);
        System.out.println("\n" + pedidoBase4.getDescricao() + " " + pedidoBase4.getTotal());
        // Decorator de frete padrão + frete expresso:
        pedidoBase4 = new Frete(pedidoBase4);
        pedidoBase4 = new FreteExpresso(pedidoBase4);
        // Decorator de seguro + Embalagem de presente:
        pedidoBase4 = new Seguro(pedidoBase4);
        pedidoBase4 = new EmbalagemPresente(pedidoBase4);
        // Possibilidade de aplicar cupons de desconto com decorator. Exemplo com cupom de 20% + tentativa de aplicar outro cupom:
        FechamentoPedido FechamentoPedido4 = new FechamentoPedido(pedidoBase4, new PagamentoCartao());
        FechamentoPedido4.AplicarCupom(20);
        FechamentoPedido4.AplicarCupom(10);
        // Fechamento de Pedido:
        System.out.println(FechamentoPedido4.exibirResumo());
        FechamentoPedido4.fecharPedido();
        System.out.println();

        System.out.println("----------------");

        // Pedido com adicionais (decorator) + formas de pagamento (Strategy), porém removendo cupom:
        PedidoCalculavel pedidoBase5 = new PedidoBase(650);
        System.out.println("\n" + pedidoBase5.getDescricao() + " " + pedidoBase5.getTotal());
        // Decorator de frete padrão + frete expresso:
        pedidoBase5 = new Frete(pedidoBase5);
        pedidoBase5 = new FreteExpresso(pedidoBase5);
        // Decorator de seguro + Embalagem de presente:
        pedidoBase5 = new Seguro(pedidoBase5);
        pedidoBase5 = new EmbalagemPresente(pedidoBase5);
        FechamentoPedido FechamentoPedido5 = new FechamentoPedido(pedidoBase5, new PagamentoCartao());
        // Fechamento de Pedido:
        System.out.println(FechamentoPedido5.exibirResumo());
        FechamentoPedido5.fecharPedido();
        System.out.println();

    }

}