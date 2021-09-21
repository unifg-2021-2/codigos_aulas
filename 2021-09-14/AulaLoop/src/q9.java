
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
public class q9 {
    public static void main(String[] args) {
        int num = 0, soma = 0;
        Scanner ler = new Scanner(System.in);
        while (num >= 0) {
            num = ler.nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }

}
