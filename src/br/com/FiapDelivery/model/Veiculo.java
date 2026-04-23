package br.com.FiapDelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeTanqueGasolina;
    private double eficienciaPorKm;
    private double gas;

    public Veiculo(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm) {
        this.setPlaca(placa);
        this.setCapacidadeTanqueGasolina(capacidadeTanqueGasolina);
        this.setEficienciaPorKm(eficienciaPorKm);
        this.setGas(0.0);

    }

    public double getGas() {
        return gas;
    }

    private void setGas(double gas) {
        this.gas = gas;
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

    public void abastecer(double qtd){
        double capac = qtd + this.gas;
        if (qtd <= 0){
            System.out.println("Quantidade impossivel de ser colocada"+qtd);
            return;
        }
        if (capac >= this.capacidadeTanqueGasolina){
            this.gas = this.capacidadeTanqueGasolina;
            System.out.println("Chegou na capacidade maxima do tanque");
            System.out.println(this.gas);
            return;
        }
        this.gas += qtd;
        System.out.printf("Abastecido com sucesso \nAgora tem : "+this.gas+"L de gasolina\n");
    }

    public void dirigir(double distanciaKm){

        double verificadorTanque = this.gas * this.eficienciaPorKm;
        double diferencaDistancia = verificadorTanque - distanciaKm;
        double resultadoGas = diferencaDistancia/this.eficienciaPorKm;
        if (distanciaKm <= 0){
            System.out.println("Desta forma o carro nem ira andar");
            return;
        }
        if (verificadorTanque < distanciaKm){
            System.out.println("Não sera possivel completar a viagem!\nPorfavor abastecer");
            return;
        }
        this.gas = resultadoGas;
        System.out.println("VRUUUM!\nViagem executada com sucesso! voce rodou: "+distanciaKm);
        System.out.println("Ainda sobrou ");
        System.out.format("%.2f",this.gas);
        System.out.println(" L de gasolina");
    }

    public boolean validarCarga(double carga){
        return false;
    }
    public boolean temCombustivelParaDirigir(double distanciaKm) {
        double alcanceAtual = this.gas * this.eficienciaPorKm;
        return alcanceAtual >= distanciaKm;
    }

}
