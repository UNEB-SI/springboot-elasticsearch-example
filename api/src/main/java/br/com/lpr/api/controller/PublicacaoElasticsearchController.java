package br.com.lpr.api.controller;

import br.com.lpr.core.service.PublicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publicacao")
public class PublicacaoElasticsearchController {

    @Autowired
    private PublicacaoService publicacaoService;

    private String atributoTeste;


    @RequestMapping(value="/indexar",  method = RequestMethod.POST)
    public ResponseEntity<?> indexarPublicacao(){
            try {
                publicacaoService.indexarPublicacao();
            }catch (Exception e){
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(e.getMessage());
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(true);
        }
}
