import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		int numero1, numero2, restoDivisao;
		Scanner s = new Scanner(System.in);
		numero1 = s.nextInt();
		numero2 = s.nextInt();
		restoDivisao = numero1 % numero2;
		if (restoDivisao == 0) {
			System.out.printf("O numero %d é divisivel por %d !", numero1, numero2);
		}
	}

}
