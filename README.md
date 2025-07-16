# Projeto ContaBanco

Este é um projeto simples em Java que simula a criação de uma conta bancária e exibe as informações fornecidas pelo usuário. O objetivo é demonstrar conceitos básicos de entrada e saída de dados, manipulação de strings e formatação em Java.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de diretórios:

```
ContaBanco/
├── src/
│   └── ContaTerminal.java
├── lib/
├── bin/
├── README.md
└── LICENSE
```

- **src/**: Contém o código-fonte do projeto.
- **lib/**: Pasta reservada para dependências externas (não utilizada neste projeto).
- **bin/**: Diretório onde os arquivos compilados são gerados.
- **README.md**: Arquivo de documentação do projeto.
- **LICENSE**: Arquivo de licença do projeto.

## Funcionalidades

O programa solicita ao usuário as seguintes informações:

1. Nome completo
2. Número da conta
3. Número da agência
4. Saldo inicial da conta

Após fornecer essas informações, o programa exibe uma mensagem formatada com os dados fornecidos.

## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html) instalado em sua máquina.
2. Compile o programa utilizando o seguinte comando no terminal:

   ```bash
   javac -d bin src/ContaTerminal.java
   ```

3. Execute o programa com o comando:

   ```bash
   java -cp bin ContaTerminal
   ```

4. Siga as instruções exibidas no terminal para interagir com o programa.

## Exemplo de Uso

Entrada do usuário:

```
Por favor, informe seu nome completo:
João Silva
Por favor, informe o número da sua conta:
12345
Por favor, informe o número da agência:
6789
Por favor, informe o saldo da conta:
1500.50
```

Saída do programa:

```
Olá JOÃO SILVA, obrigado por criar uma conta em nosso banco, sua agência é 6789, conta 12345 e seu saldo 1500.50 já está disponível para saque
```

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- IDE: Visual Studio Code

## Autor

- **Nome:** Heitor Vinicius 
- **GitHub:** [HVcostalm](https://github.com/HVcostalm)

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
