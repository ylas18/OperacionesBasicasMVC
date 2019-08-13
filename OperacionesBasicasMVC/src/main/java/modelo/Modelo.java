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
/**
 * @author Yesid
 */

/*
Creamos las variables necesarias
*/
public class Modelo
{
    public DefaultListModel lista;//lista donde se almacena los resultados de cada operacion
    private int num1;//variable que almacena el primer numero para la operacion
    private int num2;//variable que almacena el segundo numero para la operacion
    private int resultado;//variable que almacena el resultado de la operacion
    
    /**
     * Creamos los Get and Set para poder usa las variables tando de escritura como lectura
     * @return 
     */
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
    /**
     * metodo que suma las variables num 1 y num 2
     * @return 
     */
    public int Suma() {
        return this.resultado = this.num1 + this.num2;
    }
    /**
     * metodo que resta las variables num 1 y num 2
     * @return 
     */
    public int Resta() {
        return this.resultado = this.num1 - this.num2;
    }
    /*
    * metodo que multiplica las variables num 1 y num 2
    */
    public int Multiplicacion() {
        return this.resultado = this.num1 * this.num2;
    }
    /*
    * metodo que divide las variables num 1 y num 2
    */
    public int Division() {
        return this.resultado = this.num1 / this.num2;
    }
}

