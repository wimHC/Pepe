/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora.Modelo;

/**
 *
 * @author Felipe
 */
public class Boleta {
    
    private int Idboleta;
    private int Valor;
    private String fecha;

    public Boleta(int Idboleta, int Valor, String fecha) {
        this.Idboleta = Idboleta;
        this.Valor = Valor;
        this.fecha = fecha;
    }

    public int getIdboleta() {
        return Idboleta;
    }

    public void setIdboleta(int Idboleta) {
        this.Idboleta = Idboleta;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
