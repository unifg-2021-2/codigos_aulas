package meurestaurante;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
    private Garcom garcom;
    private List<Item> listaItem = new LinkedList<Item>();
    public static int numero = 0;

    public Pedido(Garcom garcom) {
        this.garcom = garcom;
        this.numero++;
    }

    public void adicionaItemNoPedido(Item item) {
        this.listaItem.add(item);
    }

    public double valorTotalPedido() {
        double total = 0;
        for (Item item : listaItem) {
            total += item.getTotalITem();
        }
        return total;
    }

    public int quantidadeDePedidos() {
        return Pedido.numero;
    }
}
