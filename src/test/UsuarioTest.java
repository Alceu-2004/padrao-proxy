import model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void deveCriarUsuarioAssinante() {

        Usuario usuario =
                new Usuario(
                        "Carlos",
                        true
                );

        Assertions.assertEquals(
                "Carlos",
                usuario.getNome()
        );

        Assertions.assertTrue(
                usuario.isAssinante()
        );
    }

    @Test
    public void deveCriarUsuarioNaoAssinante() {

        Usuario usuario =
                new Usuario(
                        "Pedro",
                        false
                );

        Assertions.assertEquals(
                "Pedro",
                usuario.getNome()
        );

        Assertions.assertFalse(
                usuario.isAssinante()
        );
    }

    @Test
    public void deveRetornarNomeCorretamente() {

        Usuario usuario =
                new Usuario(
                        "Ana",
                        true
                );

        Assertions.assertEquals(
                "Ana",
                usuario.getNome()
        );
    }
}