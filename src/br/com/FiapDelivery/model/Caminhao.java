    package br.com.FiapDelivery.model;

    public class Caminhao extends Veiculo {

        private double capacidadeEmLitros;
        private int qtdEixos;
        private static final int MAX_EIXOS = 9;
    //    aqui estou considerando o numero alem do que o numero de eixos que o caminhao ja tem, 4 eixos naturais

        public Caminhao(String placa, double capacidadeTanqueGasolina, double eficienciaPorKm, int qtdEixos) {
            super(placa, capacidadeTanqueGasolina, eficienciaPorKm);
            this.setQtdEixos(qtdEixos);
            this.setCapacidadeEmLitros(calcularCapacidadePorEixo(this.qtdEixos));
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

            if (qtdEixos > MAX_EIXOS){
                System.out.println("Quantidade Invalida de eixos "+qtdEixos+"Quantidade permitida: "+MAX_EIXOS);
                return;
            }
            if (qtdEixos <= 0){
                System.out.println("Quantidade invalidade de eixos, a quantidade de eixos deve ser maior que zero");
                return;
            }

            this.qtdEixos = qtdEixos;
        }

        private double calcularCapacidadePorEixo(int qtdEixos) {
            return qtdEixos * 1000.0;
        }

        @Override
        public boolean validarCarga(double carga) {
            return carga > 0 && carga <= this.capacidadeEmLitros;
        }

    }
