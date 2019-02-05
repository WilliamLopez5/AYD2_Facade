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
public class CDPlayer {
JTextArea consola;

    public CDPlayer(JTextArea consola){
        this.consola=consola;
    }

    public void IniciarLectura(){
        consola.setText(consola.getText()+"\nIniciar Lectura de CD");
    }

    public void DetenerLectura(){
        consola.setText(consola.getText()+"\nDetener Lectura de CD");
    }
}
