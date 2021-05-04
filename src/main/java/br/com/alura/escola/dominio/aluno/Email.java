package br.com.alura.escola.dominio.aluno;

public class Email {

    private String endereco;

    public String getEmail() {
        return endereco;
    }

    public Email(String endereco) {
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (endereco == null || !endereco.matches(regex)) {
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.endereco = endereco;
    }
}
