package service;

import proxy.ServicoStreaming;

public class StreamingService {

    private ServicoStreaming servico;

    public StreamingService(
            ServicoStreaming servico
    ) {

        this.servico = servico;
    }

    public void reproduzir() {

        servico.assistirFilme();
    }
}