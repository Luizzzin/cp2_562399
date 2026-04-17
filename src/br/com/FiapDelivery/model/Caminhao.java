package br.com.FiapDelivery.model;

public class Caminhao extends Veiculo {

    private double capacidadeEmLitros;
    private int qtdEixos;

    public Caminhao(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm, double capacidadeEmLitros, int qtdEixos) {
        super(placa, capacidadeTanqueGasolina, eficienciaPorKm);
        this.setCapacidadeEmLitros(capacidadeEmLitros);
        this.setQtdEixos(qtdEixos);
    }

    public double getCapacidadeEmLitros() {
        return capacidadeEmLitros;
    }

    private void setCapacidadeEmLitros(double capacidadeEmLitros) {
        this.capacidadeEmLitros = capacidadeEmLitros;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    private void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }


}
