package br.com.FiapDelivery.model;

public class Moto extends Veiculo {

   private boolean isBau;
   private double capacidadeBau;

    public Moto(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm, boolean isBau, double capacidadeBau) {
        super(placa, capacidadeTanqueGasolina, eficienciaPorKm);
        this.setCapacidadeBau(capacidadeBau);
        this.setIsBau(isBau);
    }

    public boolean getIsBau() {
        return isBau;
    }

    private void setIsBau(boolean isBau) {
        this.isBau = isBau;
    }

    public double getCapacidadeBau() {
        return capacidadeBau;
    }
    private void setCapacidadeBau(double capacidadeBau){
        this.capacidadeBau = capacidadeBau;

    }
}
