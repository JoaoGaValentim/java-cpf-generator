# Gerador de CPF

---

Este é um simples projeto em Java para a geração de números de CPF (Cadastro de Pessoas Físicas) válidos. O programa é executado via linha de comando, solicita ao usuário a quantidade de CPFs que deseja gerar e os exibe no console.

## Funcionalidades

- Geração de um ou mais números de CPF.
- Cálculo correto dos dígitos verificadores, garantindo a validade dos números gerados.
- Formatação do CPF no padrão `XXX.XXX.XXX-XX`.
- Interface de linha de comando interativa.

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado e configurado no seu sistema.

### Passos

1.  Clone o repositório ou baixe o arquivo `App.java`.
2.  Abra um terminal ou prompt de comando na pasta onde o arquivo se encontra.
3.  Compile o código-fonte:
    ```bash
    javac App.java
    ```
4.  Execute o programa:
    ```bash
    java App 10 # total de cpfs
    ```
5.  Veja seus CPFs gerados

    ```
    =============================
           GERADOR DE CPF
    =============================
    ====== EXIBINDO CPFs ======
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    ==========================
    ```
