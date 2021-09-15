
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raiss
 */
public class Quatro {

    public static void main(String[] args) {
        String funcionarioNome;
        int funcionarioVendas;
        double valorComissao = 0;


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        funcionarioNome = ler.next();
        System.out.println("Digite a quantidade de produtos que ele vendeu: ");
        funcionarioVendas = ler.nextInt();
        
        if (funcionarioVendas >= 500) {
            valorComissao = funcionarioVendas * 2.0;
        }
        else if (funcionarioVendas >= 250) {
            valorComissao = funcionarioVendas * 1.5;
        }
        else if (funcionarioVendas >= 0) {
            valorComissao = funcionarioVendas * 1.0;
        } else {
            System.out.println("O funcionario roubou ");
        }
        
        System.out.println("Funcionário: "+ funcionarioNome);
        System.out.println("Comissão: " + valorComissao);

    }
}
