/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author renan
 */
public class Consulta {
    private int IdConsulta;
    private Date Data_Consulta;
    private String Historico;

    //Métodos Getters e Setters
    public int getIdConsulta() {
        return IdConsulta;
    }

    public void setIdConsulta(int IdConsulta) {
        this.IdConsulta = IdConsulta;
    }

    public Date getData_Consulta() {
        return Data_Consulta;
    }

    public void setData_Consulta(Date Data_Consulta) {
        this.Data_Consulta = Data_Consulta;
    }

    public String getHistorico() {
        return Historico;
    }

    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }
    //Métodos Construtores
    public Consulta(int IdConsulta, Date Data_Consulta, String Historico) {
        this.IdConsulta = IdConsulta;
        this.Data_Consulta = Data_Consulta;
        this.Historico = Historico;
    }
    
    
}
