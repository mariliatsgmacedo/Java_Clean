package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDoAluno {
    void matricular(Aluno aluno);

    Aluno buscarPeloCPF(CPF cpf);

    List<Aluno> listarAlunosMatriculados();
}
