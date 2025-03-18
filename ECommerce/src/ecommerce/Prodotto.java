/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author alunno
 */
public class Prodotto {
    private String nome;
    private String categoria;
    private float prezzo;

    public Prodotto(String nome, String categoria, float prezzo) {
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrezzo() {
        return prezzo;
    }
    
    
}
