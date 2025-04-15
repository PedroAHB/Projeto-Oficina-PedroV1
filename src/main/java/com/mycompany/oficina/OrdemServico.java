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

public class OrdemServico {
    private int id;
    private String descricao;
    private String status;
    private Veiculo veiculo;
    private List<Peca> pecas; // lista de peças usadas na OS

    public OrdemServico(int id, String descricao, Veiculo veiculo) {
        this.id = id;
        this.descricao = descricao;
        this.status = "Aberto";
        this.veiculo = veiculo;
        this.pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void finalizarOrdem() {
        this.status = "Finalizada";
    }

    @Override
    public String toString() {
        return "OS #" + id + " - " + descricao + " - Status: " + status + " - Veículo: " + veiculo.getPlaca();
    }
}
