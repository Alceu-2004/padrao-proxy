package proxy;

import model.StreamingReal;
import model.Usuario;

public class ProxyStreaming
        implements ServicoStreaming {

    private Usuario usuario;

    private StreamingReal streamingReal;

    public ProxyStreaming(
            Usuario usuario
    ) {

        this.usuario = usuario;

        this.streamingReal =
                new StreamingReal();
    }

    @Override
    public void assistirFilme() {

        if (usuario.isAssinante()) {

            streamingReal.assistirFilme();

        } else {

            System.out.println(
                    "Acesso negado."
            );

            System.out.println(
                    "Assinatura necessária."
            );
        }
    }
}