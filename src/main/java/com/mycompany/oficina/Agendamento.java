/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
import java.util.Date;

public class Agendamento {
    private int id;
    private Date dataHora;

    public Agendamento(int id, Date dataHora) {
        this.id = id;
        this.dataHora = dataHora;
    }

    public void confirmarAgendamento() {
        System.out.println("Agendamento confirmado para " + dataHora);
    }
}

