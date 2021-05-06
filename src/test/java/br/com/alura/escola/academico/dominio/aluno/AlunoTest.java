package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        CPF cpf = new CPF("123.456.789-00");
        Email email = new Email("luiz@teste.com");
        Aluno aluno = new Aluno(cpf, "Luiz", email);
        this.aluno = aluno;
    }

    @Test
    void cadastraAteDoisTelefonesCorretamente() {
        // when
        aluno.adicionarTelefone("38", "999300001");
        aluno.adicionarTelefone("31", "998744231");
        List<Telefone> telefones = aluno.getTelefones();

        // then
        assertEquals(telefones.get(0).getNumero(), "999300001");
        assertEquals(telefones.get(1).getNumero(), "998744231");
    }

    @Test
    void naoAdicionaMaisQueDoisTelefonesPorAluno() {
        // when
        aluno.adicionarTelefone("38", "999300001");
        aluno.adicionarTelefone("31", "998744231");

        // then
        assertThrows(IllegalArgumentException.class, () -> aluno.adicionarTelefone("38", "999300002"));
    }

}