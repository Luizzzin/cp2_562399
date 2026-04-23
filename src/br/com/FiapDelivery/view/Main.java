package br.com.FiapDelivery.view;

import br.com.FiapDelivery.model.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CRIANDO VEICULOS ===");
        Moto moto = new Moto("ABC-1234", 15.0, 30.0, true, 50.0);
        Caminhao caminhao = new Caminhao("XYZ-9999", 300.0, 4.5, 6);

        System.out.println("\n=== CRIANDO PACOTES ===");
        Pacote pacotePequeno = new Pacote("PKG-001", 30.0, "Entrega fragil");
        Pacote pacoteGrande  = new Pacote("PKG-002", 8000.0, "Entrega industrial");

        System.out.println("\n=== TESTANDO MOTO SEM ABASTECER ===");
        Rota rotaMotoSemGas = new Rota(100.0, pacotePequeno, moto);
        rotaMotoSemGas.realizarEntrega(); // sem combustivel

        System.out.println("\n=== ABASTECENDO VEICULOS ===");
        moto.abastecer(15.0);
        caminhao.abastecer(300.0);

        System.out.println("\n=== MOTO ENTREGANDO PACOTE PEQUENO ===");
        Rota rotaMoto = new Rota(100.0, pacotePequeno, moto);
        rotaMoto.realizarEntrega(); // cabe no bau e tem gasosa

        System.out.println("\n=== MOTO TENTANDO PACOTE GRANDE ===");
        Rota rotaMotoGrande = new Rota(100.0, pacoteGrande, moto);
        rotaMotoGrande.realizarEntrega(); // nao cabe na moto

        System.out.println("\n=== CAMINHAO ENTREGANDO PACOTE GRANDE ===");
        Rota rotaCaminhao = new Rota(200.0, pacoteGrande, caminhao);
        rotaCaminhao.realizarEntrega(); //cabe e tem gasosa

        System.out.println("\n=== TESTANDO MOTO SEM BAU ===");
        Moto motoSemBau = new Moto("DEF-5678", 15.0, 30.0, false, 50.0);
        motoSemBau.abastecer(15.0);
        Rota rotaSemBau = new Rota(10.0, pacotePequeno, motoSemBau);
        rotaSemBau.realizarEntrega(); //sem bau

        System.out.println("\n=== TESTANDO CAMINHAO COM EIXOS INVALIDOS ===");
        Caminhao caminhaoInvalido = new Caminhao("AAA-0000", 300.0, 4.5, 99);

        System.out.println("\n=== TESTANDO CAMINHAO COM DISTANCIA LONGA ===");
        Caminhao caminhaoSemGas = new Caminhao("BBB-1111", 300.0, 4.5, 4);
        caminhaoSemGas.abastecer(10.0);
        Rota rotaLonga = new Rota(9999.0, pacoteGrande, caminhaoSemGas);
        rotaLonga.realizarEntrega();
    }
}