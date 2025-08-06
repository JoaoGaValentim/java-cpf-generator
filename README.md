# Gerador de CPF

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
    java App
    ```
5.  Siga as instruções no terminal para informar a quantidade de CPFs a serem gerados. O programa exibirá a lista de CPFs na tela.

    ```
    =============================
           GERADOR DE CPF
    =============================
    Informe o total de CPFs para ser gerado >>
    5
    ====== EXIBINDO CPFs ======
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    XXX.XXX.XXX-XX
    ==========================
    ```

## Estrutura do Código

O código está contido em um único arquivo, `App.java`, e é dividido em vários métodos estáticos para uma melhor organização:

- `main(String[] args)`: Ponto de entrada do programa. Chama `createFrame()`.
- `createFrame()`: Controla o fluxo principal da aplicação, interagindo com o usuário e exibindo os resultados.
- `generateCPF()`: Gera um único número de CPF válido, calculando os dígitos verificadores.
- `generateCPFList(int totalCPFs)`: Gera uma lista de CPFs com base na quantidade solicitada.
- `calculateVerifiedDigit(int[] digits, int position)`: Implementa o algoritmo de cálculo para um dos dígitos verificadores do CPF.
- `formatCpf(int[] digits)`: Formata um array de 11 dígitos no formato de CPF padrão (`XXX.XXX.XXX-XX`).
- `showHeader()` e `showCPFs(String[] cpfs)`: Métodos auxiliares para exibir informações de forma organizada no console.
