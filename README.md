# Controle de Estacionamento - Console Application 🚗☕

Este é um projeto acadêmico desenvolvido puramente em **Java**, sem o uso de frameworks ou bancos de dados externos. O objetivo principal da atividade é exercitar a lógica de programação, estruturas de dados em memória e os pilares da Programação Orientada a Objetos (POO).

O sistema roda diretamente no terminal/console e simula as operações diárias de um estacionamento.

---

## ⚙️ Funcionalidades Implementadas

* **Entrada de Veículos (Check-in):** Registro da placa e modelo do carro, capturando o momento de entrada.
* **Saída de Veículos (Check-out):** Liberação da vaga e cálculo automático do valor a ser pago com base no tempo decorrido.
* **Consulta de Vagas:** Exibição do status atual do estacionamento (quantas e quais vagas estão ocupadas).
* **Execução via Console:** Menu interativo no terminal para o usuário escolher as ações desejadas.

---

## 🧠 Conceitos de Programação Praticados

* **Programação Orientada a Objetos (POO):** Criação de classes como `Veiculo`, `Vaga` e `Estacionamento`.
* **Encapsulamento e Abstração:** Modificadores de acesso (`private`) e métodos getters/setters.
* **Estruturas de Dados:** Uso de listas (`List` ou `ArrayList`) para gerenciar os veículos na memória durante a execução.
* **Manipulação de Datas:** Uso da API de tempo do Java (`java.time`) para calcular o intervalo de horas.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (versão SE)
* **IDE Sugerida:** IntelliJ IDEA, Eclipse ou VS Code

---

## 📦 Como Executar o Projeto

Como o projeto utiliza apenas o Java padrão, você pode executá-lo diretamente pelo terminal da sua máquina.

### Pré-requisitos
* Ter o Java JDK instalado (versão 8 ou superior).

### 🤖 Passo a Passo

```bash
# 1. Clone este repositório
$ git clone [https://github.com/seu-usuario/estacionamento-logica-java.git](https://github.com/seu-usuario/estacionamento-logica-java.git)

# 2. Acesse a pasta do projeto
$ cd estacionamento-logica-java

# 3. Compile os arquivos Java (caso esteja usando o terminal puro)
$ javac Main.java

# 4. Execute a aplicação
$ java Main
