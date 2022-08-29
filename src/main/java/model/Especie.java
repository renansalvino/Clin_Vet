/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renan
 */
public class Especie {
    private int IdEspecie;
    private String Descricao_Exame;
    
    //Métodos Getters e Setters
       public int getIdEspecie() {
        return IdEspecie;
    }

    public void setIdEspecie(int IdEspecie) {
        this.IdEspecie = IdEspecie;
    }

    public String getDescricao_Exame() {
        return Descricao_Exame;
    }

    public void setDescricao_Exame(String Descricao_Exame) {
        this.Descricao_Exame = Descricao_Exame;
    }
    // Método Construtor
    public Especie(int IdEspecie, String Descricao_Exame) {
        this.IdEspecie = IdEspecie;
        this.Descricao_Exame = Descricao_Exame;
    }
}
