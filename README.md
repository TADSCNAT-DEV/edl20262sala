# Estrutura de Dados Lineares - 2026.2
Repositório da disciplina de Estrutura de Dados Lineares para o curso de Tecnologia e Análise Desenvolvimento de Sistemas, semestre 2026.2.

## Estrutura inicial do projeto
Este projeto usa Maven para compilar e executar aplicações Java que demonstram estruturas de dados lineares implementadas do zero (Lista, Pilha e Fila encadeadas).

### Requisitos
- Java 17+
- Maven 3.9+

### Compilar o projeto
```bash
mvn clean compile
```

### Executar aplicações de demonstração
- Lista:
```bash
mvn -Plista-demo compile exec:java
```

- Pilha:
```bash
mvn -Ppilha-demo compile exec:java
```

- Fila:
```bash
mvn -Pfila-demo compile exec:java
```

Também é possível executar qualquer aplicação informando a classe principal:
```bash
mvn compile exec:java -Dexec.mainClass=br.com.edl20262.aplicacoes.ListaDemoApplication
```
