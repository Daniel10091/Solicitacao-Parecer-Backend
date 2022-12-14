package br.org.cfm.solicitacaoparecer.interno.controller;

import br.org.cfm.solicitacaoparecer.interno.dto.SolicitacaoDto;
import br.org.cfm.solicitacaoparecer.interno.service.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class SolicitacaoControler {

    @Autowired
    SolicitacaoService solicitacaoService;

    @CrossOrigin
    @PostMapping()
    public ResponseEntity<SolicitacaoDto> solicitacao(@RequestBody SolicitacaoDto solicitacaoDto, HttpServletRequest request) {
        @SuppressWarnings("unchecked")
        List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
        if (messages == null) {
            messages = new ArrayList<>();
            request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
        }
        SolicitacaoDto solicitacaoDto1 = solicitacaoService.solicitacao(solicitacaoDto);
        return new ResponseEntity<>(solicitacaoDto1, HttpStatus.OK);
    }

}
