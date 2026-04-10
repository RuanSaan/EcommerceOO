# EcommerceOO

Sistema de e-commerce em Java utilizando Programação Orientada a Objetos.

EcommerceOO

📖 Descrição

Este projeto é um sistema de e-commerce desenvolvido em Java utilizando princípios de Programação Orientada a Objetos (POO). Ele simula o fluxo de compra de produtos, gerenciamento de carrinho, clientes e diferentes métodos de pagamento.

🛠️ Estrutura do Projeto

src/main/Main.java → Classe principal para execução do sistema.

src/model/ → Classes de domínio (Produto, Camisa, Cliente, Carrinho, Pedido).

src/payment/ → Implementações de métodos de pagamento (Cartão, Boleto, Pix).

src/exception/ → Classe de exceção personalizada para tratamento de erros.

🚀 Como Executar

Clone o repositório:

git clone https://github.com/RuanSaan/EcommerceOO.git

Abra o projeto no Visual Studio Code ou outra IDE Java.

Compile e execute a classe Main.java:

javac src/main/Main.java
java -cp src main.Main

📂 Funcionalidades

Cadastro de cliente.

Criação de carrinho de compras.

Adição de produtos (exemplo: Camisa).

Seleção de método de pagamento (Cartão, Boleto, Pix).

Finalização de pedido.

📸 Demonstração

Inclua aqui prints da execução do programa mostrando:

Cliente criado.

Produto adicionado ao carrinho.

Pagamento realizado.

Pedido finalizado.

Ex:

Java Mascot T-Shirt - R$50.0 | Tamanho: G
Pagamento de R$50.0 realizado via Pix.
Pedido fechado com sucesso!

👤 Autor

Projeto desenvolvido por Ruan Saint Pereira como prática de conceitos de POO em Java.