/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
public class Servico {
    private String tipo;
    private double preco;

    public Servico(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public double calcularCusto() {
        return preco;
    }

    @Override
    public String toString() {
        return tipo + ": R$" + preco;
    }
}

