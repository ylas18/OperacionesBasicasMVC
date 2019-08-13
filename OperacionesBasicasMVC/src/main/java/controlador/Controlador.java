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

public class Controlador implements ActionListener
{
    private Vista vista;
    private Modelo modelo;
    
    public Controlador(final Vista vista, final Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnCalcular.addActionListener(this);
    }
    
    public void inicio() {
        this.vista.setTitle("Modelo Vista Controlador");
        this.vista.setLocationRelativeTo((Component)null);
        this.modelo.lista = new DefaultListModel();
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        this.modelo.setNum1(Integer.parseInt(this.vista.txtNum1.getText()));
        this.modelo.setNum2(Integer.parseInt(this.vista.txtNum2.getText()));
        final int i = this.vista.cBoxOperacion.getSelectedIndex();
        if (i == 0) {
            this.modelo.Suma();
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));
            this.vista.jLista.setModel(this.modelo.lista);
        }
        if (i == 1) {
            this.modelo.Resta();
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));
            this.vista.jLista.setModel(this.modelo.lista);
        }
        if (i == 2) {
            this.modelo.Multiplicacion();
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));
            this.vista.jLista.setModel(this.modelo.lista);
        }
        if (i == 3) {
            this.modelo.Division();
            this.vista.txtResultado.setText(String.valueOf(this.modelo.getResultado()));
            this.modelo.lista.addElement(String.valueOf(this.modelo.getResultado()));
            this.vista.jLista.setModel(this.modelo.lista);
        }
    }
}

