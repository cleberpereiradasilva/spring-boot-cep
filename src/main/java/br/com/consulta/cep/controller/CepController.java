package br.com.consulta.cep.controller;

import br.com.consulta.cep.dto.request.CepRequestDTO;
import br.com.consulta.cep.dto.response.CepResponseDTO;
import br.com.consulta.cep.model.Cep;
import br.com.consulta.cep.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cep")
public class CepController {

    @Autowired
    CepRepository cepRepository;

    @GetMapping("/{cep}")
    public CepResponseDTO getCep(@PathVariable String cep){
        return new CepResponseDTO(cepRepository.getByCep(cep));
    }

    @PostMapping
    public Cep postCep(@RequestBody CepRequestDTO cepRequestDto){
        Cep cep = this.cepRepository.save(cepRequestDto.build());
        return cep;
    }


}
