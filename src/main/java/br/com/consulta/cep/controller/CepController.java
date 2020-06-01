package br.com.consulta.cep.controller;

import br.com.consulta.cep.dto.request.CepRequestDTO;
import br.com.consulta.cep.dto.response.CepResponseDTO;
import br.com.consulta.cep.model.ApiMessage;
import br.com.consulta.cep.model.Cep;
import br.com.consulta.cep.repository.CepRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cep")
public class CepController {

    @Autowired
    CepRepository cepRepository;

    @GetMapping("/{cep}")
    public ResponseEntity<Object> getCep(@PathVariable String cep){
        Cep cepObject = cepRepository.getByCep(cep);
        if(cepObject != null) {
            return new ResponseEntity<>(new CepResponseDTO(cepObject), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new ApiMessage("Registro não encontrado!"), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Object> postCep(@RequestBody CepRequestDTO cepRequestDto){
        if(cepRequestDto.getCep() == "" || cepRequestDto.getCep() == null){
            return new ResponseEntity<>(new ApiMessage("Favor informar o CEP"), HttpStatus.BAD_REQUEST);
        }else {
            Cep cep = this.cepRepository.save(cepRequestDto.build());
            return new ResponseEntity<>(cep, HttpStatus.CREATED);
        }
    }


}
