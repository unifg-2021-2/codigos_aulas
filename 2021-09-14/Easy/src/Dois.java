
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
public class Dois {

    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");

        }
    }
}
