/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author raiss
 */
public class UniFGBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente raissa = new Cliente("Raissa", "4949849", 30);
        Conta c1 = new Conta(raissa, 123, 5856985);
        Conta c2 = new Conta(raissa, 48788785);
        Conta c3 = new Conta();
        Conta c4 = new Conta();

        c1.depositar(2000);
        c1.transferir(1500, c2);

        System.out.println("c1 ag " + c1.getAgencia());
        System.out.println("c1 conta " + c1.getNumero());
        System.out.println("c1 titular " + c1.getTitular().getNome());
        System.out.println("c1 saldo " + c1.verSaldo());
    }

}
