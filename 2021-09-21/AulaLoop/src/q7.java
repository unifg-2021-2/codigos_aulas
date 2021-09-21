
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
public class q7 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int n;

        System.out.println("Digite o número para a tabuáda: ");
        n = Teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "X" + i + " = " + n * i);
        }
    }
}
