/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Yesid
 */
import controlador.Controlador;
import vista.Vista;
import modelo.Modelo;

public class Main
{
    /**
     * Iniciamos el programa iniciando las clases
     * @param args 
     */
    public static void main(final String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        controlador.inicio();
        vista.setVisible(true);
    }
}
