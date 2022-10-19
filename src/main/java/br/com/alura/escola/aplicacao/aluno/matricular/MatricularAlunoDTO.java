package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {
    private String cpf;
    private String nome;
    private String email;

    public MatricularAlunoDTO(String cpf, String nome, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Aluno CriarAluno(){
        return new Aluno(new CPF(cpf), nome, new Email(email));
    }

}
