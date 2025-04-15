/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */

public class Mecanico extends Funcionario {
    private String especialidade;

    public Mecanico(String nome, String email, String cargo, String especialidade) {
        super(nome, email, cargo);
        this.especialidade = especialidade;
    }

    public void realizarServico(Servico servico, Veiculo veiculo) {
        System.out.println("Serviço " + servico.toString() + " realizado no veículo: " + veiculo.toString());
    }
}
