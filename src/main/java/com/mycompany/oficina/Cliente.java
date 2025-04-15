/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */

import java.util.ArrayList;
import java.util.List;



public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    
 private List<Veiculo> veiculos;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.veiculos = new ArrayList<>(); 
        
    }
    
     public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v); // adicionando um veículo à lista
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void atualizarDados(String telefone, String endereco) {
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - " + telefone + " - " + endereco;
    }
}

