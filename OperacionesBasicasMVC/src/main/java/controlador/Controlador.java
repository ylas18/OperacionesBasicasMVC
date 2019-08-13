/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Yesid
 */
import javax.swing.ListModel;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import java.awt.Component;
import modelo.Modelo;
import vista.Vista;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    /**
     * Invoco las clases para poder usarlas en la clase controlador
     */
    private Vista vista;
    private Modelo modelo;

    /**
     * creo un contructor el cual usa las clases que invoque anteriormente
     *
     * @param vista
     * @param modelo
     */
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnCalcular.addActionListener(this);//escuchamos la accion del boton
    }

    /**
     * Este metodo lo que hace es iniciar el titulo de la ventana y la posicion
     * de la ventana al ejecutar el programa, tambien inicia la lista donde van
     * a quedar almacenados los resultados de las operaciones
     */
    public void inicio() {
        this.vista.setTitle("Modelo Vista Controlador");//titulo de la ventana
        this.vista.setLocationRelativeTo((Component) null);//pocision de la ventana
        this.modelo.lista = new DefaultListModel();//creamos la lista
    }

    /**
     * Creamos el metodo el cual es la accion del boton cuando damos clic
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        modelo.setNum1(Integer.parseInt(vista.txtNum1.getText()));//agregamos el numero que viene de parte del campo de texto de la vista en el modelo para su respectivo uso en la operacion
        modelo.setNum2(Integer.parseInt(vista.txtNum2.getText()));//agregamos el numero que viene de parte del campo de texto de la vista en el modelo para su respectivo uso en la operacion
        int i = this.vista.cBoxOperacion.getSelectedIndex();//iniciamos una variable en la cual se va a almacenar el numero de index el cual esta el combo box de las operaciones
        /**
         * validamos por medio de la condicion que operacion se va a realizar
         * dependiendo en que numero este el indicativo del index
         */
        if (i == 0) {
            modelo.Suma();//invocamos la clase modelo y el metodo sumar 
            vista.txtResultado.setText(String.valueOf(modelo.getResultado()));//agregamos en el campo de texto resultado de la vista el resultado de la operacion
            modelo.lista.addElement(String.valueOf(modelo.getResultado()));//agregamos en la lista el resultado de la operacion
            vista.jLista.setModel(modelo.lista);//mostramos en la lista que esta en la vista los resultados los cuales se han almacenado
        }
        if (i == 1) {
            this.modelo.Resta();//invocamos la clase modelo y el metodo resta
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));//agregamos en el campo de texto resultado de la vista el resultado de la operacion
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));//agregamos en la lista el resultado de la operacion
            this.vista.jLista.setModel(this.modelo.lista);//mostramos en la lista que esta en la vista los resultados los cuales se han almacenado
        }
        if (i == 2) {
            this.modelo.Multiplicacion();//invocamos la clase modelo y el metodo multiplicacion
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));//agregamos en el campo de texto resultado de la vista el resultado de la operacion
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));//agregamos en la lista el resultado de la operacion
            this.vista.jLista.setModel(this.modelo.lista);//mostramos en la lista que esta en la vista los resultados los cuales se han almacenado
        }
        if (i == 3) {
            this.modelo.Division();//invocamos la clase modelo y el metodo division
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));//agregamos en el campo de texto resultado de la vista el resultado de la operacion
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));//agregamos en la lista el resultado de la operacion
            this.vista.jLista.setModel(this.modelo.lista);//mostramos en la lista que esta en la vista los resultados los cuales se han almacenado
        }
    }
}
