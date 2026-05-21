package Sistema_de_Controle_de_Estacionamento.Entities;

import java.util.Scanner;

public class MenuUsuario {
    public void menu () {
        Motorista motor = new Motorista();
        Pagamento pagar = new Pagamento();
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean continuarNoMenu = true;

        do {
            System.out.println("\n=== SISTEMA DE ESTACIONAMENTO ===");

            System.out.println("Insira a vaga desejada (ex: 1, 2): ");
            String vagaDesejada = sc.nextLine();

            boolean vagaDisponivel = motor.verificadorVaga(vagaDesejada);

            if (vagaDisponivel) {
                System.out.println("Insira o tipo do seu veiculo: ");
                String tipoVeiculo = sc.nextLine();
                System.out.println("Insira a placa do seu veiculo: ");
                String placaVeiculo = sc.nextLine();

                boolean verificador = motor.autenticacaoVaga(tipoVeiculo, placaVeiculo);

                if (verificador) {
                    System.out.println("Insira o tempo (em horas) que o veículo ficou estacionado: ");
                    int tempoEstacionado = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    String resumoPagamento = pagar.calculoEstacionamento(tempoEstacionado);
                    System.out.println("\n" + resumoPagamento);

                    System.out.println("\nSelecione a forma de pagamento:");
                    System.out.println("1 - Cartão de Crédito (Simular Recusado)");
                    System.out.println("2 - Cartão de Débito");
                    System.out.println("3 - Pix");
                    System.out.println("4 - Dinheiro");
                    System.out.print("Opção: ");

                    opcao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("\n--- Processando Pagamento ---");

                    if (opcao == 1) {
                        System.out.println("Pagamento não autorizado.");
                        continuarNoMenu = false;
                    } else if (opcao >= 2 && opcao <= 4) {
                        System.out.println("Liberando a saída...");
                        System.out.println("Registrando o pagamento no sistema...");
                        System.out.println("Saída liberada.");
                        continuarNoMenu = false;
                    } else {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                }
            } else {
                System.out.println("Por favor, escolha outra vaga.");
            }

        } while (continuarNoMenu);

        sc.close();
        System.out.println("\n=== Fim do Programa ===");
    }
}
