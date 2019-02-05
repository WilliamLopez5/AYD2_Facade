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
public class Audio {
    JTextArea consola;
    public Audio(JTextArea consola){
        this.consola=consola;
    }

    public void IniciarAudio(){
        consola.setText(consola.getText()+"\nIniciar Audio");
    }

    public void ApagarAudio(){
        consola.setText(consola.getText()+"\nApagar Audio");
    }
    
}
