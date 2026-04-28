package org.example;

public class Vaga {
    private int numero;
    private boolean ocupada = false;
    private Veiculo veiculoEstacionado;

    public void estacionar(Veiculo carro){
        ocupada = true;
        this.veiculoEstacionado = carro;

    }

    public void liberar(){
        ocupada = false;
        this.veiculoEstacionado = null;

    }

}
