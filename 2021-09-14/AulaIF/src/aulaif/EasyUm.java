/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaif;

import java.util.Scanner;

/**
 *
 * @author raiss
 */
public class EasyUm {
    public static void main(String[] args) {
        String nomePessoa1, nomePessoa2;
        int anoPessoa1, anoPessoa2;
        int idadePessoa1, idadePessoa2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa 1");
        nomePessoa1 = ler.nextLine();
        System.out.println("Digite o ano de nascimento da Pessoa 1");
        anoPessoa1 = ler.nextInt();

        System.out.println("Digite o nome da Pessoa 2");
        nomePessoa2 = ler.nextLine();
        System.out.println("Digite o ano de nascimento da Pessoa 2");
        anoPessoa2 = ler.nextInt();

        idadePessoa1 = 2021 - anoPessoa1;
        idadePessoa2 = 2021 - anoPessoa2;

        System.out.println(nomePessoa1 + " tem " + idadePessoa1 + " anos!");
        System.out.println(nomePessoa2 + " tem " + idadePessoa2 + " anos!");

        if (idadePessoa1 > idadePessoa2) {
            System.out.println(nomePessoa2 + " é mais nova");
        } else if (idadePessoa2 > idadePessoa1) {
            System.out.println(nomePessoa1 + "é mais nova");
        } else {
            System.out.println("As duas tem a mesma idade");
        }

    }
}
