package br.org.cfm.solicitacaoparecer.externo.service;

import br.org.cfm.solicitacaoparecer.externo.dto.ViaCepDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public ViaCepDto buscaEnderecoCEP(String cep) {

        String uri = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        var result = restTemplate.getForObject(uri, ViaCepDto.class);

        return result;
    }

}
