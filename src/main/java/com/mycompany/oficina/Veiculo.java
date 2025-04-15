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

public class Veiculo {
    private String modelo;
    private String placa;
    private int anoFabricacao;
    
    private List<OrdemServico> ordensServico;

    public Veiculo(String modelo, String placa, int anoFabricacao) {
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.ordensServico = new ArrayList<>();
    }
     public void adicionarOrdemServico(OrdemServico os) {
        ordensServico.add(os);
    }

    public List<OrdemServico> getOrdensServico() {
        return ordensServico;
    }
    public void atualizarDados(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return modelo + " - " + placa + " - " + anoFabricacao;
    }
}
