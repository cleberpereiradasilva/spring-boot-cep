# Projeto para consultar endereço utilizando cep 

## Tarefa
- Construir uma **api** com dois and-points:
	- Um `and-point` utilizando o verbo **GET** 
		- Obter o `dados` de um endereço através do `cep` 
		- Caso não tenha os dados no banco de dados efetuar a busca em **`www.viacep.com.br`**
	- Um `and-point` utiliznado o verbo **POST** 
		- Receber os `dados` de um endereço e salvar no banco de dados **MongoDB**

---

## Rota [GET]

- [GET] `http://{host-url}/api/cep/00000000`

#### Resposta:    
	{
		"id": "",
		"cep": "",
		"logradouro": "",
		"complemento": "",
		"bairro": "",
		"localidade": "",
		"uf": "",
		"unidade": "",
		"ibge": ""
	}    

## Rota [POST]

- [POST] `http://{host-url}/api/cep`

#### Body
    {
    	"cep": "",
    	"logradouro": "",
    	"complemento": "",
    	"bairro": "",
    	"localidade": "",
    	"uf": "",
    	"unidade": "",
    	"ibge": ""
    }


#### Resposta    
	{
		"id": "",
		"cep": "",
		"logradouro": "",
		"complemento": "",
		"bairro": "",
		"localidade": "",
		"uf": "",
		"unidade": "",
		"ibge": ""
	}

---

## Requisitos

- [x] Necessário ser em Java 8;
- [x] Spring Boot;
- [x] Mongo;
- [x] Lombok;
- [x] Usar DTO;
- [ ] Usar collections;
- [ ] Lambdas;
- [ ] Dividir em service;
- [ ] Swagger;
- [ ] Actuator;
- [ ] Testes do service, dos endpoints;

---
## Youtube Play List
[![Play List](http://img.youtube.com/vi/3m78lzcQZ4Q/0.jpg)](https://www.youtube.com/playlist?list=PL8Bwzyk4WxBPjpRle52S83UqfgNmxznhM)


