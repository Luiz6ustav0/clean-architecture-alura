package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        String cpf = "123.456.789-02";

        MatricularAlunoDto dto = new MatricularAlunoDto("Luiz", cpf, "luiz@teste.com");
        useCase.matricular(dto);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF(cpf));

        assertEquals("Luiz", encontrado.getNome());
        assertEquals("luiz@teste.com", encontrado.getEmail());
        assertEquals(cpf, encontrado.getCpf());
    }
}