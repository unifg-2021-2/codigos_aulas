
public class EasyUm {
    public static void main(String[] args) {
        String CEP = "4501a-200";

        boolean valido = true;

        for (int i = 0; i < CEP.length(); i++) {
            Character c = CEP.charAt(i);
            if (i == 5) {
                if (!c.equals('-')) {
                    valido = false;
                    break;
                }
            } else {
                if (!Character.isDigit(c)) {
                    valido = false;
                    break;
                }

            }
        }

        if (valido) {
            System.out.println("é valido");
        } else {
            System.out.println("Não Valido");
        }

    }
}
