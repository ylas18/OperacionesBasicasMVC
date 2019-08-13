/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yesid
 */

import javax.swing.DefaultListModel;

public class Modelo
{
    public DefaultListModel lista;
    private int num1;
    private int num2;
    private int resultado;
    
    public int getNum1() {
        return this.num1;
    }
    
    public void setNum1(final int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return this.num2;
    }
    
    public void setNum2(final int num2) {
        this.num2 = num2;
    }
    
    public int getResultado() {
        return this.resultado;
    }
    
    public void setResultado(final int resultado) {
        this.resultado = resultado;
    }
    
    public DefaultListModel getLista() {
        return this.lista;
    }
    
    public void setLista(final DefaultListModel lista) {
        this.lista = lista;
    }
    
    public int Suma() {
        return this.resultado = this.num1 + this.num2;
    }
    
    public int Resta() {
        return this.resultado = this.num1 - this.num2;
    }
    
    public int Multiplicacion() {
        return this.resultado = this.num1 * this.num2;
    }
    
    public int Division() {
        return this.resultado = this.num1 / this.num2;
    }
}

