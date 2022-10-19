package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularPorLinhaDeComando {

    public static void main(String[] args) {
        String cpf = "123.456.789-00";
        String nome = "Fulano de tal";
        String email = "fulano@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunoEmMemoria());

        matricular.executa(new MatricularAlunoDTO(cpf, nome, email));

    }
}
