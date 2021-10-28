public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta();
        // conta1.saldo = 100;
        conta1.deposita(50);
        System.out.println(conta1.saldo);
    }
}
