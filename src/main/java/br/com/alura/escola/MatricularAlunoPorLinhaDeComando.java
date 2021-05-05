package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {

        String nome = "Zezin da Silva";
        String cpf = "123.456.789-01";
        String email = "lalala@laland.net";

        MatricularAluno executa = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        executa.matricular(new MatricularAlunoDto(nome, cpf, email));

    }

}
