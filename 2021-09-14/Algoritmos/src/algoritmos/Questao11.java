package algoritmos;
import java.util.Scanner;

public class Questao11 {
    
    public static void main(String[] args) {
        System.out.println("Questao 10");
        Scanner Teclado = new Scanner(System.in);
        double a1;
        double k;
        double r;
        double progArit;
        double progGeom;
        
        System.out.println("Digite o valor do primeiro elemento: ");
        a1 = Teclado.nextDouble();
        System.out.println("Digite o numero do termo: ");
        k = Teclado.nextDouble();
        System.out.println("Digite o valor da razao: ");
        r = Teclado.nextDouble();
        
        progArit = a1 + (k - 1) * r;
        System.out.println("A progracao aritimetica e igual a:" + progArit);
        progGeom = a1 * (Math.pow(r,k-1));
        System.out.println("A progracao geometrica e igual a:" + progGeom);
    }
}
