import model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import proxy.ProxyStreaming;
import service.StreamingService;

public class StreamingServiceTest {

    @Test
    public void deveCriarService() {

        Usuario usuario =
                new Usuario(
                        "Carlos",
                        true
                );

        StreamingService service =
                new StreamingService(
                        new ProxyStreaming(
                                usuario
                        )
                );

        Assertions.assertNotNull(
                service
        );
    }

    @Test
    public void deveExecutarStreamingAssinante() {

        Usuario usuario =
                new Usuario(
                        "Carlos",
                        true
                );

        StreamingService service =
                new StreamingService(
                        new ProxyStreaming(
                                usuario
                        )
                );

        Assertions.assertDoesNotThrow(
                service::reproduzir
        );
    }

    @Test
    public void deveExecutarStreamingNaoAssinante() {

        Usuario usuario =
                new Usuario(
                        "Pedro",
                        false
                );

        StreamingService service =
                new StreamingService(
                        new ProxyStreaming(
                                usuario
                        )
                );

        Assertions.assertDoesNotThrow(
                service::reproduzir
        );
    }

    @Test
    public void deveExecutarMultiplasReproducoes() {

        Usuario usuario =
                new Usuario(
                        "Carlos",
                        true
                );

        StreamingService service =
                new StreamingService(
                        new ProxyStreaming(
                                usuario
                        )
                );

        Assertions.assertDoesNotThrow(
                () -> {

                    service.reproduzir();

                    service.reproduzir();
                }
        );
    }
}