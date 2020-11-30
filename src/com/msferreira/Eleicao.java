package com.msferreira;

public class Eleicao {

    private int eleitores;
    private float validos;
    private float brancos;
    private float nulos;

    public Eleicao(int eleitores, float validos, float brancos, float nulos){
        setEleitores(eleitores);
        setValidos(validos);
        setBrancos(brancos);
        setNulos(nulos);
    }

    public int getEleitores() {
        return eleitores;
    }

    public void setEleitores(int eleitores) {
        this.eleitores = eleitores;
    }

    public float getValidos() {
        return validos;
    }

    public void setValidos(float validos) {
        this.validos = validos;
    }

    public float getBrancos() {
        return brancos;
    }

    public void setBrancos(float brancos) {
        this.brancos = brancos;
    }

    public float getNulos() {
        return nulos;
    }

    public void setNulos(float nulos) {
        this.nulos = nulos;
    }

}
