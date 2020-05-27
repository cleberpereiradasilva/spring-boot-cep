# Projeto para consultar endereço utilizando cep 

## Tarefa
- Criar uma api com dois and-points:
	- Um and-point utilizando o verbo **GET** 
		- Obter o `dados` de um endereço através do `cep` 
		- Caso não tenha os dados no banco de dados efetuar a busca em `www.viacep.com.br`
	- Um and-point utiliznado o verbo **POST** 
		- Receber os dados de um endereço e salvar no banco de dados **MongoDB**

---

# Rotas

    [GET] `http://{host-url}/api/cep/00000000`

### Resposta:
<code>
    
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
</code>

    [POST] `http://{host-url}/api/cep`

### Body

<pre>
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
</pre>

### Resposta

    ```
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
    ```

---

# Requisitos

- [ ] Necessário ser em Java 8;
- [ ] Spring Boot;
- [ ] Mongo;
- [ ] Lombok;
- [ ] Usar DTO;
- [ ] Usar collections;
- [ ] Lambdas;
- [ ] Dividir em service;
- [ ] Swagger;
- [ ] Actuator;
- [ ] Testes do service, dos endpoints;