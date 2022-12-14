package br.org.cfm.solicitacaoparecer.interno.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitacaoDto {

    private String assunto;
    private String mensagem;
    private String justificativa;
    private byte[] arquivo;
    private SolicitanteDto solicitante;

}
