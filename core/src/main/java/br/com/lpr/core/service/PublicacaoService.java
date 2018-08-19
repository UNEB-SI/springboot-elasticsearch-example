package br.com.lpr.core.service;

import br.com.lpr.core.indexacao.PublicacaoIndexacaoService;
import br.com.lpr.core.util.PublicacaoBuilderTemporaryUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacaoService {

    @Autowired
    private PublicacaoIndexacaoService pubIndexService;

    public void indexarPublicacao(){
        PublicacaoBuilderTemporaryUtil.build()
                .forEach(pub -> pubIndexService.indexar(pub));
    }
}
