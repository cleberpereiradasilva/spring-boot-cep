package br.com.consulta.cep.dto.response;

import br.com.consulta.cep.model.Cep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepResponseDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String unidade;

    public CepResponseDTO(Cep cep){
        this.cep = cep.getCep();
        this.localidade = cep.getLocalidade();
        this.complemento = cep.getComplemento();
        this.bairro = cep.getBairro();
        this.logradouro = cep.getLogradouro();
        this.uf = cep.getUf();
        this.unidade = cep.getUnidade();
    }
}
