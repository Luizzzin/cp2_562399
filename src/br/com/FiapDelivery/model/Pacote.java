package br.com.FiapDelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String registroEntrega;

    public Pacote(String codigo, double peso, String registroEntrega) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setRegistroEntrega(registroEntrega);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRegistroEntrega() {
        return registroEntrega;
    }

    public void setRegistroEntrega(String registroEntrega) {
        this.registroEntrega = registroEntrega;
    }
}
