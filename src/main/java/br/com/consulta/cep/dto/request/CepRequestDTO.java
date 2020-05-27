package br.com.consulta.cep.dto.request;
import br.com.consulta.cep.model.Cep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepRequestDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String unidade;
    private String ibge;

    public Cep build(){
        Cep cep = new Cep()
                .setCep(this.cep)
                .setLocalidade(this.localidade)
                .setLogradouro(this.logradouro)
                .setComplemento(this.complemento)
                .setBairro(this.bairro)
                .setUf(this.uf)
                .setIbge(this.ibge)
                .setUnidade(this.unidade);
        return cep;
    }
}
