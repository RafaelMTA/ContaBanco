# ContaBanco - Desafio Java Básico (DIO)

Este projeto é parte da **Trilha Java Básico** da [Digital Innovation One (DIO)](https://www.dio.me).  

## 📌 Descrição do Desafio

O objetivo deste desafio é criar um programa em Java que simule a abertura de uma conta bancária via terminal.

## 📋 Requisitos

- [x] Criar o projeto `ContaBanco`
- [x] Implementar a classe `ContaTerminal.java`
- [x] Coletar dados do usuário via terminal usando `Scanner`
- [x] Exibir mensagem personalizada após cadastro

## 🛠️ Estrutura da Conta

| Atributo       | Tipo      | Validação               | Exemplo        |
|----------------|-----------|-------------------------|----------------|
| Número         | `int`     | Numérico e > 0          | `1021`         |
| Agência        | `String`  | Não vazio (trim)        | `"067-8"`      |
| Nome Cliente   | `String`  | Não vazio (trim)        | `"MARIO ANDRADE"` |
| Saldo          | `double`  | Numérico e >= 0          | `237.48`       |


## 💻 Como Executar

```bash
git clone https://github.com/RafaelMTA/ContaBanco.git
cd ContaBanco
```

## 🔳 Exemplo de Saída
```bash
Por favor, digite o número da Conta (Numero maior que 0):
1021
Por favor, digite o número da agência (Não pode ser vazio): 
067-8
Por favor, digite o Nome (Não pode ser vazio):
MARIO ANDRADE
Por favor, digite o Saldo (Numero maior ou igual a 0):
237.48

Olá MARIO ANDRADE, 
obrigado por criar uma conta em nosso banco, 
sua agência é 067-8, 
conta 1021 e seu saldo 237.48 já está disponível para saque.
```