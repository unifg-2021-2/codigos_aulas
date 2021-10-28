/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meurestaurante;

/**
 *
 * @author raiss
 */
public class MeuRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garcom g0 = new Garcom();
        Garcom g1 = new Garcom("Roberto", 135);
        Garcom g2 = new Garcom("Juliana", 136);
        Garcom g3 = new Garcom("Marcio", 137);
        Garcom g4 = new Garcom("Angelica", 138);

        Produto p0 = new Produto("Coca-Cola", 47895, 3.00);
        Produto p1 = new Produto("Pespi", 47887, 3.00);
        Produto p2 = new Produto("Batata Ruflles", 12895, 5.00);

        Item i0 = new Item(2, p0);
        Item i1 = new Item(10, p2);
        Item i2 = new Item(6, p1);

        Pedido pe1 = new Pedido(g1);
        pe1.adicionaItemNoPedido(i0);
        pe1.adicionaItemNoPedido(i1);
        pe1.adicionaItemNoPedido(i2);

        System.out.println("Valor total do pedido: " + pe1.valorTotalPedido());
        Pedido pe4 = new Pedido(g1);
        Pedido pe2 = new Pedido(g1);
        Pedido pe3 = new Pedido(g1);

        System.out.println("Total Pedidos = " + Pedido.numero);
    }

}
