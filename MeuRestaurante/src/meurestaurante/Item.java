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
public class Item {

    private int quantidade;
    private Produto produto;
    private double totalITem;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.totalITem = produto.getPrecoUnitario() * this.quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getTotalITem() {
        return totalITem;
    }

    @Override
    public String toString() {
        return "Item{" + "quantidade=" + quantidade + ", produto=" + produto + ", totalITem=" + totalITem + '}';
    }

}
