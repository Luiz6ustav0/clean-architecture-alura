package escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("-33","-3232-333"));
    }

    @Test
    void deveriaCriarTelefonesValidosCorretamente() {
        // given
        Telefone telefone1 = new Telefone("33", "995094500");
        Telefone telefone2 = new Telefone("31", "988030522");
        Telefone telefone3 = new Telefone("41", "988454504");

        String expected1 = "33995094500";
        String expected2 = "31988030522";
        String expected3 = "41988454504";

        // when
        String returned1 = telefone1.getFullNumberString();
        String returned2 = telefone2.getFullNumberString();
        String returned3 = telefone3.getFullNumberString();

        // then
        assertEquals(expected1, returned1);
        assertEquals(expected2, returned2);
        assertEquals(expected3, returned3);
    }

}