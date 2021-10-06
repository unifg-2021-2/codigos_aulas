package algoritmos;
import java.util.Scanner;
import java.util.Arrays;

public class Questao04 {
    
    public static void main(String[] args) {
        System.out.println("Questao 4");
        Scanner Teclado = new Scanner(System.in);
        float[] vetor = new float [3];
        
        for (int i=0; i<3; i++){
            System.out.println("Digite um número: ");
            vetor[i] = Teclado.nextFloat();
        }
        Arrays.sort(vetor);
        for (int i=0; i<3; i++){
            System.out.println(vetor[i]);
        }
    }
}