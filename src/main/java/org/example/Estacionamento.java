package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private Tarifario tarifario;
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;

    public Estacionamento(int totalVagas){
        this.vagas = new ArrayList<>(); // Inicializa o Array
        for (int i=0; i <= totalVagas; i++){
            Vaga novaVaga = new Vaga(i); // cria a vaga com base no numero
            this.vagas.add(novaVaga); // Adiciona no Array

        }

    }

    public void registrarEntrada(Veiculo carro){


    }

    public void registrarSaida(String placa){


    }

    public void exibirVagasLivres(){
        System.out.println(" --- VAGAS DISPONÍVEIS ---");

        System.out.println("Vagas disponiveis agora: ");

        for(Vaga vaga : vagas){
            if(!vaga.getOcupada()){
                System.out.println("Vaga " + vaga.getNumero() + " ");


            }

        }

    }

}
