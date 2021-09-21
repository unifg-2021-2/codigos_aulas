
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
public class q3 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String nome;
        int n;

        System.out.println("Digite o nome do usuário: ");
        nome = Teclado.next();
        System.out.println("Digite o número de repetições");
        n = Teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }
    }
}
