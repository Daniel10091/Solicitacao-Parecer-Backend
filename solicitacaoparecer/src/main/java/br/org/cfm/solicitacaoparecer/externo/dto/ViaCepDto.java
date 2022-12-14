package br.org.cfm.solicitacaoparecer.externo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViaCepDto {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

}
