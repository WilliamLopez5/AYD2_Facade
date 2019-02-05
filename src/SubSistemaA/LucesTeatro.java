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
public class LucesTeatro {
        JTextArea consola;

    public LucesTeatro(JTextArea consola){
        this.consola=consola;
    }
    
    public void lucesOFF(){
        consola.setText(consola.getText()+"\nLuces Apagadas");
    }

    public void lucesON(){
        consola.setText(consola.getText()+"\nLuces Encendidas");
    }

}
