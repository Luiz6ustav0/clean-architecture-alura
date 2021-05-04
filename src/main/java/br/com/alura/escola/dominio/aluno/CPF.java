package br.com.alura.escola.dominio.aluno;

public class CPF {
    private String numero;

    public String getNumberString() {
        return numero;
    }

    public CPF(String numero) {
        String regex = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}";
        if (numero == null || !(numero.matches(regex))) {
            throw new IllegalArgumentException("CPF invalido");
        }
        this.numero = numero;
    }
}
