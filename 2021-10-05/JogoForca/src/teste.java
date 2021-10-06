
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String diai = ler.nextLine();
        String horarioi = ler.nextLine();
        String diaf = ler.nextLine();
        String horariof = ler.nextLine();

        char juntar0 = diai.charAt(4);
        int diaI = juntar0;

        char juntar = horarioi.charAt(0);
        char juntari = horarioi.charAt(1);
        int horai = juntar + juntari;

        char juntar2 = horarioi.charAt(3);
        char juntar2i = horarioi.charAt(4);
        int minutoi = juntar2 + juntar2i;

        char juntar3 = horarioi.charAt(6);
        char juntar3i = horarioi.charAt(7);
        int segundoi = juntar3 + juntar3i;

        char juntar0f = diaf.charAt(4);
        int diaF = juntar0f;

        char juntar4 = horariof.charAt(0);
        char juntar4i = horariof.charAt(1);
        int horaf = juntar4 + juntar4i;

        char juntar5 = horariof.charAt(3);
        char juntar5i = horariof.charAt(4);
        int minutof = juntar5 + juntar5i;

        char juntar6 = horariof.charAt(6);
        char juntar6i = horariof.charAt(7);
        int segundof = juntar6 + juntar6i;

        int diaTotal = diaI - diaF;
        int horaTotal = horai - horaf;
        int minutoTotal = (minutoi - minutof) - 60;
        int segundoTotal = (segundoi - segundof) - 60;

        if (segundoTotal > 60) {
            segundoTotal = segundoTotal - 60;
            minutoTotal++;
        } else if (segundoTotal < 0) {
            segundoTotal = segundoTotal + 60;
        } else if (segundoTotal == segundoTotal) {
        }

        if (minutoTotal > 60) {
            minutoTotal = minutoTotal - 60;
            horaTotal++;
        } else if (minutoTotal < 0) {
            minutoTotal = Math.abs(minutoTotal);
            minutoTotal = minutoTotal - 60;
        } else if (minutoTotal == minutoTotal) {
        }

        if (horaTotal > 24) {
            horaTotal = horaTotal - 24;
            diaTotal++;
        } else if (horaTotal < 0) {
            horaTotal = horaTotal + 24;
        } else if (horaTotal == horaTotal) {
        }

        if (diaTotal > 30) {
            diaTotal--;
        } else if (diaTotal < 0) {
            diaTotal = Math.abs(diaTotal);
            diaTotal = diaTotal - 1;
            horaTotal = horaTotal - 24;
            horaTotal = Math.abs(horaTotal);
        } else if (diaTotal == diaTotal) {
        }

        System.out.println(diaTotal + " dia(s)");
        System.out.println(horaTotal + " hora(s)");
        System.out.println(minutoTotal + " minuto(s)");
        System.out.println(segundoTotal + " segundo(s)");
    }
}
