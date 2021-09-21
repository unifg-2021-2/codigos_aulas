
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
public class q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, qtd = 0;
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            num = ler.nextInt();
            if (num > 0 && num < 50) {
                qtd++;
            }
        }
        System.out.println(qtd);

    }

}
