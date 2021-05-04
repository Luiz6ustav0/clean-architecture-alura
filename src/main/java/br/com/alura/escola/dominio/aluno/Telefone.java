package br.com.alura.escola.dominio.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public String getFullNumberString() {
        return ddd + numero;
    }

    public Telefone(String ddd, String numero) {
        String regex = "(\\+?55)?(0?(([14689][1-9])|(2[12478])|(3[1234578])|(5[1345])|(7[134579])))9[6-9][0-9]{7}";
        if (ddd == null || numero == null || !(ddd + numero).matches(regex)) {
            throw new IllegalArgumentException("Telefone Invalido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
