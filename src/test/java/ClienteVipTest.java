import org.example.ClienteVip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteVipTest {

    @Test
    void deveRetornarChekinAutoriazado(){
        ClienteVip cv = new ClienteVip();
        cv.setAvaliacao(5);
        cv.setStatus(true);
        assertEquals("Chekin autorizado", cv.verificarChekin());
    }

    @Test
    void deveRetornarChekinNaoAutoriazado(){
        ClienteVip cv = new ClienteVip();
        cv.setAvaliacao(2);
        cv.setStatus(true);
        assertEquals("Não autorizado", cv.verificarChekin());
    }

    @Test
    void deveRetornarTipoClinte(){
        ClienteVip cv = new ClienteVip();
        cv.setAvaliacao(2);
        cv.setStatus(true);
        assertEquals("Cliente Vip", cv.getTipo());

    }
    @Test
    void deveRetornarDescricao(){
        ClienteVip cv = new ClienteVip();
        cv.setAvaliacao(5);
        cv.setStatus(true);
        cv.setNome("Maria Antonia");
        cv.setId(15);
        assertEquals("Cliente Vip{id=15, nome='Maria Antonia', Status do chekin=Chekin autorizado}", cv.getInfo());
    }
}
