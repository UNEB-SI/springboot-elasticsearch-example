package br.com.lpr.core.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

import static br.com.lpr.core.util.ConstantsUtil.ELASTICSEARCH_INDEX_NAME;
import static br.com.lpr.core.util.ConstantsUtil.ELASTICSEARCH_TYPE_NAME;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = ELASTICSEARCH_INDEX_NAME, type = ELASTICSEARCH_TYPE_NAME)
public class PublicacaoElasticDTO {
    private Long id;
    private String titulo;
    private String resumo;
    private List<String> palavrasChave;
    private String autor;
    private String lattes;
    private String orientador;
    private String dataDeposito;
    private String dataDefesa;
    private String conteudoArquivo;
}
