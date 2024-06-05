# ClassesJogo

Este projeto é um exemplo simples de como criar classes e objetos em Java para representar heróis de um jogo de aventura. Cada herói tem propriedades como nome, idade e tipo (guerreiro, mago, monge, ninja) e pode realizar um ataque específico baseado no seu tipo.

## Estrutura do Projeto

ClassesJogo/
├── src/
│ └── Heroi.java
└── bin/

## Funcionalidades

- **Classe Heroi**: Representa um herói com nome, idade e tipo.
- **Método atacar**: Exibe uma mensagem personalizada de ataque baseada no tipo do herói.

## Como Compilar e Executar

### Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.

### Passos

1. **Clone o repositório**:

   git clone <URL_DO_REPOSITORIO>

2. Navegue até o diretório do projeto:

    cd L:/VSCode/JAVA/ESTUDOS/ClassesJogo

3. Compile o arquivo Heroi.java para a pasta bin:

    javac -d bin src/Heroi.java

4. Navegue até a pasta bin:
    
    cd bin

5. Execute o programa:

    java Heroi

## Exemplo de Saída

O mago Gandalf de 150 anos atacou usando magia
O guerreiro Arthur de 30 anos atacou usando espada
O monge Shaolin de 25 anos atacou usando artes marciais
O ninja Naruto de 20 anos atacou usando shuriken

