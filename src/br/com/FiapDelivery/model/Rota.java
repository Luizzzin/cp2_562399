package br.com.FiapDelivery.model;

public class Rota {

    private double distanciaKm;
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(double distanciaKm, Pacote pacote, Veiculo veiculo) {
        this.setDistanciaKm(distanciaKm);
        this.setPacote(pacote);
        this.setVeiculo(veiculo);
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    private void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public Pacote getPacote() {
        return pacote;
    }

    private void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    private void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public boolean podeRealizarEntrega() {
        if(!veiculo.validarCarga(pacote.getLitros())){
            System.out.println("Veiculo não comporta pacote");
            return false;
        }
        if (!veiculo.temCombustivelParaDirigir(distanciaKm)) {
            System.out.println("Combustivel insuficiente para a rota!");
            return false;
        }
        System.out.println("Entrega pode ser realizada!");
        return true;
    }
    public void realizarEntrega(){
        if (!podeRealizarEntrega()) {
            System.out.println("Entrega não pode ser realizada!");
            return;
        }
        veiculo.dirigir(distanciaKm);
    }
}
