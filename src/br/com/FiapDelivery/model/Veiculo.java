package br.com.FiapDelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeTanqueGasolina;
    private double eficienciaPorKm;

    public Veiculo(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm) {
        this.setPlaca(placa);
        this.setCapacidadeTanqueGasolina(capacidadeTanqueGasolina);
        this.setEficienciaPorKm(eficienciaPorKm);
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeTanqueGasolina() {
        return capacidadeTanqueGasolina;
    }

    private void setCapacidadeTanqueGasolina(double capacidadeTanqueGasolina) {
        this.capacidadeTanqueGasolina = capacidadeTanqueGasolina;
    }

    public double getEficienciaPorKm() {
        return eficienciaPorKm;
    }

    private void setEficienciaPorKm(double eficienciaPorKm) {
        this.eficienciaPorKm = eficienciaPorKm;
    }
}
