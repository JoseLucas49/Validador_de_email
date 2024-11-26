# 📨 Sistema de validação de email com padrão Adapter
Este projeto implementa um validador de e-mail simples em Java, utilizando o padrão Adapter para integrar diferentes métodos de validação de e-mail (utilizando classes e funções). O sistema permite validar e-mails tanto por meio de uma interface orientada a objetos (classe) quanto por meio de funções.

## 🏗️ Estrutura do Projeto
O projeto está organizado em diferentes classes e interfaces, cada uma com uma responsabilidade específica, implementando o padrão Adapter para que dois tipos diferentes de validação possam ser utilizados de maneira uniforme:

- ```ValidadorEmailProtocolo:``` Interface que define o método de validação isEmail() utilizado por classes de validação.
- ```ValidadorEmailFuncaoProtocolo:``` Interface que define o método de validação validar() utilizado por funções de validação.
- ```AdapterValidadorEmailClasse:``` Adapter que implementa a interface ```ValidadorEmailProtocolo``` e utiliza a biblioteca ```Apache Commons Validator``` para validar e-mails.
- ```AdapterValidadorEmailFuncao:``` Adapter que utiliza uma implementação baseada em funções para validar o e-mail através da interface ```ValidadorEmailFuncaoProtocolo```.
- ```Main:``` Classe principal que executa o código e testa as diferentes validações de e-mail.

## 💻 Tecnologias usadas:
- Java 22
- Apache Commons Validator (para validação de e-mails)

## ▶️ Como Executar o Projeto
1. Clone o repositório ou copie o código para seu ambiente local.
2. Compile e execute a classe Main.
