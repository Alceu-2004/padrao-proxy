import model.StreamingReal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreamingRealTest {

    @Test
    public void deveCriarStreamingReal() {

        StreamingReal streaming =
                new StreamingReal();

        Assertions.assertNotNull(
                streaming
        );
    }

    @Test
    public void deveExecutarFilme() {

        StreamingReal streaming =
                new StreamingReal();

        Assertions.assertDoesNotThrow(
                streaming::assistirFilme
        );
    }

    @Test
    public void devePermitirMultiplasExecucoes() {

        StreamingReal streaming =
                new StreamingReal();

        Assertions.assertDoesNotThrow(
                () -> {

                    streaming.assistirFilme();

                    streaming.assistirFilme();
                }
        );
    }
}