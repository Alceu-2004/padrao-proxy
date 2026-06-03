package model;

import proxy.ServicoStreaming;

public class StreamingReal
        implements ServicoStreaming {

    @Override
    public void assistirFilme() {

        System.out.println(
                "Reproduzindo filme premium..."
        );
    }
}