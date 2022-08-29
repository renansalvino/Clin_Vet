/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renan
 */
public class Animal {


    private int IdAnimal;
    private String Nome;
    private int Idade;
    private String Sexo;

    public int getIdAnimal() {
        return IdAnimal;
    }

    public void setIdAnimal(int IdAnimal) {
        this.IdAnimal = IdAnimal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
        public Animal(int IdAnimal, String Nome, int Idade, String Sexo) {
        this.IdAnimal = IdAnimal;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
    }
}
    
    
