package br.com.consulta.cep.controller;

import br.com.consulta.cep.model.Cep;
import br.com.consulta.cep.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cep")
public class CepController {

    @Autowired
    CepRepository cepRepository;

    @GetMapping()
    public Cep getCep(){
        return cepRepository.getByCep("01001-000");
    }


    @PostMapping
    public Cep getCep(@RequestBody Cep cep){
        this.cepRepository.save(cep);
        return cep;
    }


}
