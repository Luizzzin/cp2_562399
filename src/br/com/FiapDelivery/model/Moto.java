package br.com.FiapDelivery.model;

public class Moto extends Veiculo {

   private boolean isBau;
   private double capacidadeBau;

    public Moto(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm, boolean isBau, double capacidadeBau) {
        super(placa, capacidadeTanqueGasolina, eficienciaPorKm);
        this.setIsBau(isBau);
        this.setCapacidadeBau(capacidadeBau);
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
        if(!isBau){
            System.out.println("Sua moto não pode ser cadastrada para viagens e entregas!");
            this.capacidadeBau = 0.0;
            return;
        }
        if (capacidadeBau <= 0){
            System.out.println("capacidade do bau deve ser maior que zero");
            return;
        }
        this.capacidadeBau = capacidadeBau;

    }
        @Override
        public boolean validarCarga(double carga){
        if (!this.isBau) return false;
        return carga > 0 && carga <= this.capacidadeBau;
    }
}
