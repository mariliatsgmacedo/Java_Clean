package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {
    @Test
    void AlunoDeveriaSerPersistido() {
        RepositorioDeAlunoEmMemoria repoEmMemoria = new RepositorioDeAlunoEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repoEmMemoria);

        MatricularAlunoDTO dados =
                new MatricularAlunoDTO("123.456.789-00", "Fulano", "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado =
                repoEmMemoria.buscarPeloCPF(new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }

}