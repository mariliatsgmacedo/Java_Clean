package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;

    public Aluno(CPF cpf, String nome, Email email) {
    }

    public String getCpf() {
        return cpf.getNumero();
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    //um aluno pode ter varios numeros de telefone
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd,numero));
    }
}
