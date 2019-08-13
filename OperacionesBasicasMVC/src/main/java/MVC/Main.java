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
    public static void main(final String[] args) {
        final Modelo modelo = new Modelo();
        final Vista vista = new Vista();
        final Controlador controlador = new Controlador(vista, modelo);
        controlador.inicio();
        vista.setVisible(true);
    }
}
