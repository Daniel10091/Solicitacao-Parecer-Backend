package br.org.cfm.solicitacaoparecer.interno.service;

import br.org.cfm.solicitacaoparecer.interno.dto.SolicitacaoDto;
import org.springframework.stereotype.Service;

@Service
public class SolicitacaoService {

    public SolicitacaoDto solicitacao(SolicitacaoDto solicitacao) {
        SolicitacaoDto solicitacaoDto = new SolicitacaoDto();

        solicitacaoDto.setAssunto(solicitacao.getAssunto());
        solicitacaoDto.setMensagem(solicitacao.getMensagem());
        solicitacaoDto.setJustificativa(solicitacao.getJustificativa());
        solicitacaoDto.setArquivo(solicitacao.getArquivo());
        solicitacaoDto.setSolicitante(solicitacao.getSolicitante());

        return solicitacaoDto;
    }

}
