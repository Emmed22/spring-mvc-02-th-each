# Spring MVC 02 - Treinando th:each

## 📚 Sobre o Projeto

Este projeto faz parte da minha trilha de estudos em Spring MVC e Thymeleaf.

O objetivo deste mini projeto foi compreender como coleções de dados podem ser enviadas do Controller para a View e renderizadas dinamicamente utilizando o atributo `th:each` do Thymeleaf.

Durante o desenvolvimento, foram explorados conceitos fundamentais de Java, Spring MVC e Thymeleaf que servirão como base para projetos maiores.

---

## 🎯 Objetivos de Aprendizado

* Trabalhar com coleções utilizando `List<String>`
* Utilizar `ArrayList`
* Enviar dados para a View através do `Model`
* Utilizar `model.addAttribute()`
* Renderizar listas dinamicamente com `th:each`
* Compreender variáveis temporárias em loops Thymeleaf
* Utilizar objetos de status (`status.count`, `status.first`)
* Entender a diferença entre listas de tipos simples e listas de objetos

---

## 🛠 Tecnologias Utilizadas

* Java 25
* Spring Boot
* Spring MVC
* Thymeleaf
* Maven

---

## 📂 Estrutura do Projeto

```text
src
 └─ main
     ├─ java
     │   └─ controller
     │       └─ LivroController
     │
     └─ resources
         └─ templates
             └─ livros.html
```

---

## 🚀 Funcionalidade Implementada

O Controller cria uma lista de livros e a disponibiliza para a View através do Model.

A página HTML utiliza `th:each` para percorrer a coleção e exibir os livros dinamicamente.

Exemplo de saída:

```text
Livro 1 - Dom Casmurro
Livro 2 - O Idiota
Livro 3 - Persuasão
Livro 4 - Orgulho e Preconceito
Livro 5 - Guerra e Paz
```

---

## 🧠 Conceitos Praticados

### Controller

Recebimento da requisição HTTP e envio de dados para a View.

### Model

Transporte de dados entre Controller e Thymeleaf.

### List e ArrayList

Estruturas de dados para armazenamento de múltiplos elementos.

### Thymeleaf

Renderização dinâmica de conteúdo utilizando:

* `th:each`
* `th:text`

### Status do Loop

Utilização de informações do loop através de:

* `status.count`
* `status.first`

---

## 📈 Evolução da Trilha

✔ Projeto 01 - Model + th:text

✔ Projeto 02 - th:each

🔜 Projeto 03 - RequestParam

🔜 Projeto 04 - th:field

🔜 Projeto 05 - Redirect

🔜 Projeto 06 - Sistema de Produtos

---

## 👨‍💻 Autor

Projeto desenvolvido como parte da minha jornada de estudos em Spring Boot, Spring MVC e Thymeleaf.
