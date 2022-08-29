/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renan
 */
public class Veterinario {
    private int IdVeterinario;
    private String Nome;
    private String Endereco;
    private int Telefone;

    //Métodos Getters e Setters
    public int getIdVeterinario() {
        return IdVeterinario;
    }

    public void setIdVeterinario(int IdVeterinario) {
        this.IdVeterinario = IdVeterinario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
    //Método Construtor
    public Veterinario(int IdVeterinario, String Nome, String Endereco, int Telefone) {
        this.IdVeterinario = IdVeterinario;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }
}
