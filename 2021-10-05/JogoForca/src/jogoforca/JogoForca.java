package jogoforca;

import java.util.Random;
import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {
        //TODO : puxar palavrar de um arquivo
        Scanner le = new Scanner(System.in);

        String palavraSorteada = sorteiaPalavra();
        char[] letrasDaPalavra = inicializaQuantidadeDeLetrasDaPalavra(palavraSorteada);

        char chute;
        boolean acertou = false;
        boolean enforcou = false;
        int erro = 0;
        int quantaLetrasFaltam = contaLetrasQueFaltam(letrasDaPalavra);
        System.out.println(palavraSorteada);
        imprime(letrasDaPalavra);

        while (!acertou && !enforcou) {
            imprime(letrasDaPalavra);
            System.out.println("Digite uma letra: ");
            chute = le.next().charAt(0);
            if (verifica(chute, palavraSorteada)) {
                for (int i = 0; i < palavraSorteada.length(); i++) {
                    if (palavraSorteada.charAt(i) == chute) {
                        letrasDaPalavra[i] = chute;
                    }
                }
                quantaLetrasFaltam = contaLetrasQueFaltam(letrasDaPalavra);
                if (quantaLetrasFaltam == 0) {
                    System.out.println("Parabéns!  Acertou a palavra " + palavraSorteada);
                    acertou = true;
                }

            } else {
                erro++;
                desenha_forca(erro);
                if (erro == 6) {
                    enforcou = true;
                    System.out.println("Você perdeu todas as chances. A palavra era: " + palavraSorteada);
                }
            }
        }
    }

    public static String sorteiaPalavra() {
        String[] palavras = {"programacao", "estudar", "tecnologia", "software", "modelagem",
            "classes", "metodos", "variaveis", "conectividade", "nuvem", "dados"};

        Random sorteia = new Random();

        return palavras[sorteia.nextInt(10)];
    }
    
    public static boolean verifica(char letra, String palavra){
        boolean existeLetraNaPalavra = false;
        if (palavra.contains(String.valueOf(letra))) {
            existeLetraNaPalavra = true;
        }
        return existeLetraNaPalavra;
    }
    
    public static char[] inicializaQuantidadeDeLetrasDaPalavra(String palavra) {
        int tamanho = palavra.length();
        char[] letras = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            letras[i] = '*';
        }
        return letras;
    }
    
    public static void imprime(char[] palavra) {
        //for (char c : palavra) {
        for (int i = 0; i < palavra.length; i++) {
            System.out.print(palavra[i]);
            System.out.print(" ");
        }

        System.out.println("");
    }

    public static int contaLetrasQueFaltam(char[] letras) {
        int cont = 0;
        for (char c : letras) {
            if (c == '*') {
                cont++;
            }
        }
        return cont;
    }

    public static void desenha_forca(int erros) {
        System.out.println("  _______     ");
        System.out.println(" |/      |    ");

        switch (erros) {
            case 1:
                System.out.println(" |      (_)   ");
                System.out.println(" |            ");
                System.out.println(" |            ");
                System.out.println(" |            ");
                break;
            case 2:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\     ");
                System.out.println(" |            ");
                System.out.println(" |            ");
                break;
            case 3:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\|    ");
                System.out.println(" |            ");
                System.out.println(" |            ");
                break;
            case 4:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\|/   ");
                System.out.println(" |            ");
                System.out.println(" |            ");
                break;
            case 5:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\|/   ");
                System.out.println(" |       |    ");
                System.out.println(" |      /     ");
                break;
            case 6:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\|/   ");
                System.out.println(" |       |    ");
                System.out.println(" |      / \\   ");
                break;
        }
        System.out.println(" |            ");
        System.out.println("_|___         ");
        System.out.println();

    }
}
