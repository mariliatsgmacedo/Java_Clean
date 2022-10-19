package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDoAluno;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunoEmMemoria implements RepositorioDoAluno {
    List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPeloCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(item -> item.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarAlunosMatriculados() {
        return this.matriculados;
    }
}
