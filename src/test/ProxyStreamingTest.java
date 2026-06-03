import model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import proxy.ProxyStreaming;

public class ProxyStreamingTest {

    @Test
    public void devePermitirAcessoAssinante() {

        Usuario usuario =
                new Usuario(
                        "Carlos",
                        true
                );

        ProxyStreaming proxy =
                new ProxyStreaming(
                        usuario
                );

        Assertions.assertDoesNotThrow(
                proxy::assistirFilme
        );
    }

    @Test
    public void deveNegarAcessoNaoAssinante() {

        Usuario usuario =
                new Usuario(
                        "Pedro",
                        false
                );

        ProxyStreaming proxy =
                new ProxyStreaming(
                        usuario
                );

        Assertions.assertDoesNotThrow(
                proxy::assistirFilme
        );
    }

    @Test
    public void deveCriarProxy() {

        Usuario usuario =
                new Usuario(
                        "Ana",
                        true
                );

        ProxyStreaming proxy =
                new ProxyStreaming(
                        usuario
                );

        Assertions.assertNotNull(
                proxy
        );
    }
}