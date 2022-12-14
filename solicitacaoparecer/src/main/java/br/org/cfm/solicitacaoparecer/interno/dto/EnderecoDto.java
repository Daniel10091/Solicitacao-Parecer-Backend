package br.org.cfm.solicitacaoparecer.interno.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDto {

    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String estado;
    private String cidade;
    private String telefone;
    private String celular;

}
