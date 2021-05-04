package escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido@"));
    }

    @Test
    void deveriaCriarEmailsCorretamenteComEnderecosValidos() {
        // given
        Email email1 = new Email("luiz@outlook.com");
        Email email2 = new Email("my.second.email@gmail.com.br");

        String expected1 = "luiz@outlook.com";
        String expected2 = "my.second.email@gmail.com.br";

        // when
        String returnedEmail1 = email1.getEmail();
        String returnedEmail2 = email2.getEmail();

        // then
        assertEquals(expected1, returnedEmail1);
        assertEquals(expected2, returnedEmail2);
    }

}