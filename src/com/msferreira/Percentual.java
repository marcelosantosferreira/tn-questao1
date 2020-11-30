package com.msferreira;

public class Percentual {

    Eleicao eleicao;

    public Percentual(Eleicao eleicao){
        this.eleicao = eleicao;
    }

    public float votosValidos(){
        return (eleicao.getValidos() / eleicao.getEleitores()) * 100;
    }

    public float votosBrancos(){
        return (eleicao.getBrancos() / eleicao.getEleitores()) * 100;
    }

    public float votosNulos(){
        return (eleicao.getNulos() / eleicao.getEleitores()) * 100;
    }
}
