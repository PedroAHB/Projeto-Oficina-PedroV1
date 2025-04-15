/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
public class Funcionario extends Usuario {
    protected String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public void atualizarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo;
    }
}
