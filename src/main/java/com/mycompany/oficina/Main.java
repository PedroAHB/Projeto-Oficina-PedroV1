/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Strada", "JKL5678", 2021);

        OrdemServico os = new OrdemServico(101, "Troca de amortecedor", carro);

        Peca p1 = new Peca(1, "Amortecedor dianteiro", 2);
        Peca p2 = new Peca(2, "Parafuso de fixação", 4);

        os.adicionarPeca(p1);
        os.adicionarPeca(p2);

        System.out.println(os.toString());
        System.out.println("Peças utilizadas:");
        for (Peca p : os.getPecas()) {
            System.out.println("- " + p.toString());
        }
    }
}

