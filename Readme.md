# Guina Bank 💰🏦

O Guina Bank é um programa Java que simula um sistema bancário simples. Ele permite criar clientes, contas bancárias e realizar operações como depósito, saque e transferência de fundos entre contas.

## Funcionalidades 🎯

- Cadastro de clientes
- Criação de contas bancárias associadas aos clientes
- Depósito em contas
- Saque de contas
- Transferência de fundos entre contas

## Como usar 🚀

1. Clone o repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/seu-usuario/guina-bank.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd guina-bank
   ```

3. Compile os arquivos Java:

   ```bash
   javac Main.java
   ```

4. Execute o programa:

   ```bash
   java Main
   ```

5. Siga as instruções exibidas no console para interagir com o programa.

## Estrutura do Projeto 🏗️

- `Main.java`: Arquivo principal que contém a função `main` e inicia a execução do programa.
- `Pessoa.java`: Definição da classe Pessoa, que representa um cliente.
- `Cliente.java`: Definição da classe Cliente, que estende a classe Pessoa e adiciona informações específicas do cliente.
- `Conta.java`: Definição da classe Conta, que representa uma conta bancária associada a um cliente.

## Exemplo de Uso 📝

```java
Cliente aguinaldo = new Cliente("Aguinaldo");
Cliente churupita = new Cliente("Churupita");

Conta conta123 = new Conta(123, 10, aguinaldo);
Conta conta456 = new Conta(456, 0, churupita);

conta123.depositar(100);
conta456.sacar(50);
conta123.transferir(20, conta456);
```

## Contribuição 🤝

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.