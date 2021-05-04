package escola;

public class Telefone {

    private String ddd;
    private String numero;

    public String getFullNumberString() {
        return ddd + numero;
    }

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null || !(ddd + numero).matches(
        "(\\+?55)?(0?(([14689][1-9])|(2[12478])|(3[1234578])|(5[1345])|(7[134579])))9[6-9][0-9]{7}")
        ) {
            throw new IllegalArgumentException("Telefone Invalido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
