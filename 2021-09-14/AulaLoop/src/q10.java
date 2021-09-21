
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class q10 {
    public static void main(String[] args) {
        int tam;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome = ler.nextLine();

        tam = nome.length();
        for (int i = 0; i < tam; i++) {
            System.out.println(nome.charAt(i));
        }

    }
}
