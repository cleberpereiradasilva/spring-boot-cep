# Exemplo de projeto busca de cep (spring-boot-cep)

---

# Descrição

    Criar uma api com dois and-points.
    Um and-point utilizando o verbo **GET**
     - Obter o `dados` de um endereço através do `cep`
     - Caso não tenha os dados no banco de dados efetuar a busca em `www.viacep.com.br`
    Um and-point utiliznado o verbo **POST**
     - Receber os dados de um endereço e salvar no banco de dados MondoDB

---

# Rotas

    [GET] http://{host-url}/api/cep/00000000

### Resposta:

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

    [POST] http://{host-url}/api/cep

### Body

    ```
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
    ```

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

[ ]-Necessário ser em Java 8.

[] Spring

- Usar DTO
- Usar collections
- Lambdas
- Dividir em service
- Lombok
- Swagger
- Actuator
- Mongo
- Testes do service, dos endpoints
