/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author mpisching
 */
public class Produto {
    private String nome;
    private float precoCusto;
    private float margemLucro;
    
    public float calcularPrecoVenda() {
        return getPrecoCusto() + (getPrecoCusto() * getMargemLucro() / 100);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the precoCusto
     */
    public float getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the margemLucro
     */
    public float getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }
    
    
}
