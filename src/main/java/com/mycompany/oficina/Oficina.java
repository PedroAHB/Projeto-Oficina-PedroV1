/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oficina;

/**
 *
 * @author Ana Clara
 */
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Servico> servicos = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(String nome) {
        clientes.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(String placa) {
        veiculos.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome) {
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void executarServico(String placa, String tipoServico) {
        System.out.println("Executando serviço " + tipoServico + " no veículo com placa " + placa);
        // Aqui poderia ser implementada a lógica de buscar veículo e aplicar o serviço
    }
}

