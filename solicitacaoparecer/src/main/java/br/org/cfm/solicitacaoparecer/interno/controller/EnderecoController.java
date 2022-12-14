package br.org.cfm.solicitacaoparecer.interno.controller;

import br.org.cfm.solicitacaoparecer.externo.dto.ViaCepDto;
import br.org.cfm.solicitacaoparecer.externo.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EnderecoController {

    @Autowired
    ViaCepService viaCepService;

    @CrossOrigin
    @GetMapping("/busca-endereco/{cep}")
    public ViaCepDto buscaEnderecoCep(@PathVariable("cep") String cep) {
        var retorno = viaCepService.buscaEnderecoCEP(cep);
        return retorno != null ? retorno : null;
    }

}
