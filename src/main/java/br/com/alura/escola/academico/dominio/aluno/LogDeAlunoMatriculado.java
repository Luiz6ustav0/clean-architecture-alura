package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {
    @Override
    public void reageAo(Evento evento) {
        String momentoFromatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(
                String.format(
                        "Aluno com CPF %s matriculado em: %s",
                        ((AlunoMatriculado) evento).getCpfDoAluno().getNumero(), momentoFromatado
                )
        );
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
