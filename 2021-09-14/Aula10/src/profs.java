
import java.util.Scanner;

public class profs {
    public static void main(String[] args) {
        String[] nomeProfessor = new String[2];
        int[] tempoProfissao = new int[2];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            nomeProfessor[i] = ler.next();
            System.out.println("experiencia: ");
            tempoProfissao[i] = ler.nextInt();
        }
        System.out.println("Professor      Tempo de Profissão");
        for (int i = 0; i < 2; i++) {
            System.out.println(nomeProfessor[i] + "\t\t" + tempoProfissao[i]);
        }

    }
}
