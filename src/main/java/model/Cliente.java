/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renan
 */
public class Cliente {

  
    private int IdCliente;
    private String Nome;
    private String Endereco;
    private String CEP;
    private String Email;
    

    //Métodos Getters e Setters
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
        //Método construtor
    public Cliente(int IdCliente, String Nome, String Endereco, String CEP, String Email) {
        this.IdCliente = IdCliente;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.CEP = CEP;
        this.Email = Email;
    }
    
}


