# 🥟 Baozi Store API

API REST desenvolvida para gerenciamento de produtos da **Baozi Store**, permitindo o cadastro, consulta, atualização e remoção de itens de forma simples e eficiente.

---

## 📌 Descrição

A **Baozi Store API** é uma aplicação backend construída em Java que fornece endpoints REST para gerenciar o estoque de produtos de uma loja.

Com ela, é possível:

* 📦 Cadastrar produtos
* 🔍 Listar produtos
* ✏️ Atualizar informações
* ❌ Remover produtos

---

## 🚀 Tecnologias utilizadas

* ☕ Java
* 🌱 Spring Boot
* 🗄️ MySQL
* 🔗 JDBC (ou API REST padrão)
* 📬 Postman (para testes)

---

## 📁 Estrutura do Projeto

```
src/
 ├── controller/
 ├── model/
 ├── repository/
 ├── service/
 └── application.properties
```

---

## ⚙️ Configuração

### 🔹 1. Clonar o projeto

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

### 🔹 2. Configurar o banco de dados

No arquivo `application.properties`, configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/baozi_store
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

---

### 🔹 3. Executar a aplicação

Execute a classe principal do Spring Boot:

```bash
mvn spring-boot:run
```

Ou diretamente pelo Eclipse.

---

## 📬 Endpoints da API

### 🔹 📦 Cadastrar produto

**POST** `/produtos`

```json
{
  "nome": "Baozi de Carne",
  "preco": 12.50,
  "estoque": true
}
```

---

### 🔹 📋 Listar produtos

**GET** `/produtos`

---

### 🔹 🔍 Buscar produto por ID

**GET** `/produtos/{id}`

---

### 🔹 ✏️ Atualizar produto

**PUT** `/produtos/{id}`

```json
{
  "nome": "Baozi Vegetariano",
  "preco": 10.00,
  "estoque": true
}
```

---

### 🔹 ❌ Deletar produto

**DELETE** `/produtos/{id}`

---

## 🧪 Testes

Os endpoints podem ser testados utilizando:

* Postman
* Insomnia
* cURL

---

## 💡 Exemplo de resposta

```json
{
  "id": 1,
  "nome": "Baozi de Frango",
  "preco": 11.50,
  "estoque": true
}
```

---

## 📈 Melhorias futuras

* 🔐 Autenticação com JWT
* 📊 Controle de pedidos
* 👤 Cadastro de clientes
* 🛒 Sistema de compras

---

## 👨‍💻 Autor

Desenvolvido por **Rafael Vieira**

---

## 📄 Licença

Este projeto é de uso acadêmico e livre para estudos.
