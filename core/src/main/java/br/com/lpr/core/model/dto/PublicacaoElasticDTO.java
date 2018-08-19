package br.com.lpr.core.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
