package Sistema_de_Controle_de_Estacionamento.Entities;

import java.util.Random;

public class Motorista {
    public String [] tiposVeiculos = {"Carro", "Moto", "Caminhão", "Camionete", "Ônibus"};
    public String [] placasVeiculos = {"ABC1D23", "XYZ9G87", "MNO4H56", "JKL2F34", "QWE6R78"};
    public String [] vagasOcupadas = {"1","2","4"};

    public String horarioDeEntrada () {
        Random rand = new Random();

        int horarioHoras = rand.nextInt(24);
        int horarioMinutos = rand.nextInt(60);

        return "A hora é: "+horarioHoras+":"+horarioMinutos;
    }

    public boolean verificadorVaga (String vaga){
        boolean verificarVaga = true;

        for (int i = 0;i < vagasOcupadas.length; i ++){
            if (vaga.equals(vagasOcupadas[i])){
                System.out.println("Vaga indisponivel");
                verificarVaga = false;
                break;
            }

        }

        return verificarVaga;
    }

    public boolean autenticacaoVaga (String tipoCarroUser, String placaCarroUser) {

        Motorista motor = new Motorista();
        String msg;
        msg =  String.format("Tipo de carro: "+ tipoCarroUser +
                "Placa do veiculo: " + placaCarroUser +
                "Horário de entrada: " + motor.horarioDeEntrada()
        );

        return true;
    }
}
