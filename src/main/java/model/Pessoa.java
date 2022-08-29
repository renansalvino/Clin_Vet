/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renan
 */
public class Pessoa {


    private int IdPessoa;
    private String Nome;
    private String Endereco;
    private String Telefone;

    //Métodos Getters e Setters
    public int getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(int IdPessoa) {
        this.IdPessoa = IdPessoa;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
        //Método Construtor
        public Pessoa(int IdPessoa, String Nome, String Endereco, String Telefone) {
        this.IdPessoa = IdPessoa;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }
}
