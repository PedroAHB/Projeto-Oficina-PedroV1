/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
public class RelatorioFinanceiro {
    private double receitas;
    private double despesas;

    public RelatorioFinanceiro(double receitas, double despesas) {
        this.receitas = receitas;
        this.despesas = despesas;
    }

    public double calcularLucro() {
        return receitas - despesas;
    }
}

