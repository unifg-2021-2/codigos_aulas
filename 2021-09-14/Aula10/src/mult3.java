
import java.util.Random;
import com.sun.tools.javac.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class mult3 {
    public static void main(String[] args) {
        int[] vetor1, vetor2;
        vetor1 = new int[50];
        vetor2 = new int[50];
        Random sorteia = new Random();

        for (int i = 0; i < 50; i++) {
            vetor1[i] = sorteia.nextInt(50);
            vetor2[i] = vetor1[i] * 3;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(" " + vetor1[i]);

        }
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.print(" " + vetor2[i]);


        }


    }
}
