import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        // /SIMULE O JOGO DE ADIVINHAÇÃO: O SISTEMA SORTEIA UM NÚMERO ENTRE 1 E X;
        // O JOGADOR INSERE NÚMEROS NA TENTATIVA DE ACERTAR O NÚMERO SORTEADO. 
        // QUANDO ELE ACERTAR, O ALGORITMO DEVERÁ INFORMAR QUE ELE ACERTOU O NÚMERO Y EM N TENTATIVAS 

        Random sorteia = new Random();
        Scanner ler = new Scanner (System.in);
        int intervalo, sorteado, escolhido, tentativas=1;
        boolean nao_acertou = true;

        System.out.println("Escolha o maior numero possivel: ");
        intervalo = ler.nextInt();
        sorteado = sorteia.nextInt(intervalo);

        // while (acertou)
        while(nao_acertou == true){
            System.out.println("Digite um valor entre 0 e "+ intervalo);
            escolhido = ler.nextInt();
            if (escolhido==sorteado){
                System.out.println("\nAcertou o numero "+sorteado+" em " +tentativas+ "vezes");
                nao_acertou=false;
            }
            else{
                tentativas+=1;
            }

        }


    }
}
