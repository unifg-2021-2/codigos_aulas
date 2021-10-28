public class Conta {
    private float saldo;
    float limite;
    int agencia;
    int numero;
    String titular;

    void deposita(float valor){
        if(valor<=0){
            System.out.println("Não é possivel depositar valor negativo");
        }else{
        this.saldo += valor;
    }
    }


}
