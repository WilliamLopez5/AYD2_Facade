/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubSistemaA;

import javax.swing.JTextArea;

/**
 *
 * @author Willy
 */
public class DVDPlayer {
    JTextArea consola;

    public DVDPlayer(JTextArea consola){
        this.consola=consola;
    }

    public void IniciarLectura(){
        consola.setText(consola.getText()+"\nIniciar Lectura de DVD");
    }

    public void DetenerLectura(){
        consola.setText(consola.getText()+"\nDetener Lectura de DVD");
    }    
}
