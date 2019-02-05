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
public class Proyector {
    JTextArea consola;
    public Proyector(JTextArea consola){
        this.consola=consola;
    }
    
    public void IniciarProyeccion(){
        consola.setText(consola.getText()+"\nIniciar Proyección de Imagen");
    }

    public void ApagarProyeccion(){
        consola.setText(consola.getText()+"\nApagar Proyección de Imagen");
    }
    
    
}
