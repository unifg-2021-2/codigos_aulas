/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meurestaurante;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author raiss
 */
public class Produto {
    private String nome;
    private int codigo;
    private double precoUnitario;
    public static List<Produto> listaProduto = new LinkedList<Produto>();

    public Produto(String nome, int codigo, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.listaProduto.add(this);
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", codigo=" + codigo + ", precoUnitario=" + precoUnitario + '}';
    }

}
