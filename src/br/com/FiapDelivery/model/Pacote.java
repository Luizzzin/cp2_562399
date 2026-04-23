package br.com.FiapDelivery.model;

public class Pacote {

    private String codigo;
    private double litros;
    private String registroEntrega;

    public Pacote(String codigo, double litros, String registroEntrega) {
        this.setCodigo(codigo);
        this.setLitros(litros);
        this.setRegistroEntrega(registroEntrega);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {

        if (codigo == null){
            System.out.println("Codigo invalido, digite novamente");
            return;
        }

        this.codigo = codigo;
    }

    public double getLitros() {
        return litros;
    }

    private void setLitros(double litros) {
        if (litros <= 0) {
            System.out.println("Volume inválido, deve ser maior que zero.");
            return;
        }
        this.litros = litros;
    }

    public String getRegistroEntrega() {
        return registroEntrega;
    }

    private void setRegistroEntrega(String registroEntrega) {
        if (registroEntrega == null) {
            System.out.println("Registro de entrega inválido!");
            return;
        }
        this.registroEntrega = registroEntrega;
    }
}
