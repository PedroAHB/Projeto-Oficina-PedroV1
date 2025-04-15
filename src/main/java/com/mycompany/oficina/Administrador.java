/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
public class Administrador extends Usuario {
    private int nivelAcesso;

    public Administrador(String nome, String email, int nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        System.out.println("Funcionário cadastrado: " + funcionario.getNome());
    }

    public void cadastrarPeca(Peca peca) {
        System.out.println("Peça cadastrada: " + peca.getNome());
    }
}

