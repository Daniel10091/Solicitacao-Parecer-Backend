package br.org.cfm.solicitacaoparecer.interno.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitanteDto {

    private String nome;
    private String crm;
    private String uf;
    private String cpf;
    private EnderecoDto endereco;

}
