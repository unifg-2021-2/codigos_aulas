/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Character;
/**
 *
 * @author raiss
 */
public class aulaaula {
    public static void main(String[] args) {
        String CEP = "45010-200";


        boolean valido = true;

        for (int i = 0; i < CEP.length(); i++) {
            Character c = CEP.charAt(i);
            if (i == 5) {
                if (!c.equals('-')) {
                    System.out.println("Não Valido");
                    valido = false;
                    break;
                }
            } else {
                if (!Character.isDigit(c)) {
                    System.out.println("Não Valido");
                    valido = false;
                    break;
                }

            }
        }

        if (valido) {
            System.out.println("é valido");
        }

    }
}
