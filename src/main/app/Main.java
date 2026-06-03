package app;

import model.Usuario;
import proxy.ProxyStreaming;
import service.StreamingService;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=== USUÁRIO ASSINANTE ==="
        );

        Usuario assinante =
                new Usuario(
                        "Carlos",
                        true
                );

        StreamingService service1 =
                new StreamingService(
                        new ProxyStreaming(
                                assinante
                        )
                );

        service1.reproduzir();

        System.out.println();

        System.out.println(
                "=== USUÁRIO NÃO ASSINANTE ==="
        );

        Usuario visitante =
                new Usuario(
                        "Pedro",
                        false
                );

        StreamingService service2 =
                new StreamingService(
                        new ProxyStreaming(
                                visitante
                        )
                );

        service2.reproduzir();
    }
}