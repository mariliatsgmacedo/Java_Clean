package br.com.alura.escola.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioDoAluno {
    void matricular(Aluno aluno);

    Aluno buscarPeloCPF(CPF cpf) throws SQLException;

    List<Aluno> listarAlunosMatriculados();
}
