package br.com.alura.escola.aluno;

import br.com.alura.escola.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("4545"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("1111111111"));
    }

    @Test
    void deveriaCriarCPFsValidosCorretamente() {
        // given
        CPF cpf1 = new CPF("58754341809");
        CPF cpf2 = new CPF("897.925.765-17");

        String expected1 = "58754341809";
        String expected2 = "897.925.765-17";

        // when
        String returnedCPF1 = cpf1.getNumberString();
        String returnedCPF2 = cpf2.getNumberString();

        // then
        assertEquals(expected1, returnedCPF1);
        assertEquals(expected2, returnedCPF2);
    }

}