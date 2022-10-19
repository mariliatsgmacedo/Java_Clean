package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDoAluno;

public class MatricularAluno {
    private final RepositorioDoAluno repositorio;

    public MatricularAluno(RepositorioDoAluno repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDTO dados) {
        Aluno novo = dados.CriarAluno();
        repositorio.matricular(novo);
    }
}
