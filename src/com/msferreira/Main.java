package com.msferreira;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);

        Percentual percentual = new Percentual(eleicao);
        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        System.out.println("O percentual de votos válidos é " + decimalFormat.format(percentual.votosValidos()) + "%");
        System.out.println("O percentual de votos brancos é " + decimalFormat.format(percentual.votosBrancos()) + "%");
        System.out.println("O percentual de votos nulos é " + decimalFormat.format(percentual.votosNulos()) + "%");
    }
}
