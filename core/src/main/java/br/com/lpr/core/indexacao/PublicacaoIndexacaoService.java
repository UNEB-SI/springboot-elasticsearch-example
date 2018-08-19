package br.com.lpr.core.indexacao;

import br.com.lpr.core.model.dto.PublicacaoElasticDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;

import static br.com.lpr.core.util.ConstantsUtil.ELASTICSEARCH_INDEX_NAME;
import static br.com.lpr.core.util.ConstantsUtil.ELASTICSEARCH_TYPE_NAME;

@Service
public class PublicacaoIndexacaoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublicacaoIndexacaoService.class);
    @Autowired
    private ElasticsearchTemplate elasticTemplate;

    public void indexar(PublicacaoElasticDTO publicacaoAttached) {

        if (publicacaoAttached != null) {
            IndexQuery indexQuery = new IndexQueryBuilder().withIndexName(ELASTICSEARCH_INDEX_NAME)
                    .withObject(publicacaoAttached).withType(ELASTICSEARCH_TYPE_NAME).withId(publicacaoAttached.getId().toString())
                    .build();
            elasticTemplate.index(indexQuery);
        }
        LOGGER.info("Finalizando o processamento de indexação da publicação: {} em: {}", publicacaoAttached.getId(), new Date());
    }
}
