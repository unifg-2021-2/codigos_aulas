/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class Conta {

    private float saldo;
    private float limite;
    private int agencia;
    private int numero;
    private Cliente titular;

    //construtores
    public Conta(Cliente titular, int agencia, int numero) {
        System.out.println("Criando a instância do objeto " + this + " com 3 parametros");
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }
    public Conta(Cliente titular, int numConta) {
        System.out.println("Criando a instância do objeto " + this + " com 2 parametros");
        this.agencia = 123;
        this.titular = titular;
        this.numero = numConta;
    }
    public Conta() {
        System.out.println("Criando a instância do objeto " + this + " sem parametros");
    }
    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Não é possivel depositar valor negativo");
        } else {
            saldo += valor;
        }
    }

    private boolean podeSacar(float valor) {
        float saldoTotal = this.saldo + this.limite;

        if (saldoTotal > valor) {
            return true;
        } else {
            return false;
        }
    }

    public void sacar(float valor) {
        if (this.podeSacar(valor)) {
            saldo -= valor;
        } else {
            System.out.println("você não tem dinheiro");
        }
    }

    public float verSaldo() { //getter
        return this.saldo;
    }

    public void transferir(float valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

}
