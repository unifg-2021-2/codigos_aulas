package meurestaurante;

import java.util.LinkedList;
import java.util.List;

public class Garcom {

    private String nome;
    private int matricula;
    public static List<Garcom> listaGarcom = new LinkedList<Garcom>(); //ARRAY

    public Garcom(String nome1, int matricula1) {
        this.nome = nome1;
        this.matricula = matricula1;
        this.listaGarcom.add(this);
    }

    public Garcom() {
        this.listaGarcom.add(this);
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public void setMatricula(int valor) {
        this.matricula = valor;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Matricula: " + this.matricula;
    }
}
