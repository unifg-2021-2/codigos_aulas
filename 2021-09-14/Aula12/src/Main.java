
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sorteada = sorteiaPalavra();
        char[] letrasOcultas = inicializaQuantidadeLetras(sorteada);
        char chute;
        int erros = 0;
        boolean acertou = false;
        boolean enforcou = false;
        int letrasFaltando = letrasOcultas.length;

        System.out.println(sorteada);

        while (!acertou && !enforcou) {
            imprime(letrasOcultas);
            chute = pedeChute();
            if (verifica(chute, sorteada)) {
                for (int i = 0; i < sorteada.length(); i++) {
                    if (sorteada.charAt(i) == chute) {
                        letrasOcultas[i] = chute;
                    }
                }
                letrasFaltando = contaLetrasFaltando(letrasOcultas);
                if (letrasFaltando == 0) {
                    System.out.println("Parabens");
                    acertou = true;
                }
            } else {
                erros += 1;
                desenha_forca(erros);

                if (erros == 7) {
                    enforcou = true;
                }

            }
        }

    }

    public static int contaLetrasFaltando(char[] letrasOcultas) {
        int cont = 0;
        for (char c : letrasOcultas) {
            if (c == '_') {
                cont++;
            }
        }
        return cont;
    }

    public static void imprime(char[] palavra) {
        for (char c : palavra) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static String sorteiaPalavra() {
        Random sorteia = new Random();
        String[] palavras = {"programacao", "estudar", "tecnologia", "software", "modelagem",
            "classes", "metodos", "variaveis"};
        String palavraSorteada = palavras[sorteia.nextInt(palavras.length)];
        return palavraSorteada;

    }

    public static char[] inicializaQuantidadeLetras(String palavra) {
        int tamanho = palavra.length();
        char[] letrasAcertadas = new char[tamanho];
        for (int i = 0; i < palavra.length(); i++) {
            letrasAcertadas[i] = '_';
        }
        return letrasAcertadas;
    }

    public static char pedeChute() {
        char chute;
        Scanner le = new Scanner(System.in);
        System.out.println("Qual letra?");
        chute = (char) le.next().charAt(0);

        return chute;
    }

    public static boolean verifica(char chute, String palavraSecreta) {
        boolean existe = false;

        if (palavraSecreta.contains(String.valueOf(chute))) {
            existe = true;
        }

        return existe;
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
                System.out.println(" |            ");
                break;
            case 6:
                System.out.println(" |      (_)   ");
                System.out.println(" |      \\|/   ");
                System.out.println(" |       |    ");
                System.out.println(" |      /     ");
                break;
            case 7:
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
