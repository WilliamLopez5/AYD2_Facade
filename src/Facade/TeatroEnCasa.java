/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;
import SubSistemaA.*;
import javax.swing.JTextArea;
/**
 *
 * @author Willy
 */

public class TeatroEnCasa {
    Audio audio;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    LucesTeatro lucesTeatro;
    Proyector proyector;
    JTextArea consola;
    
    public TeatroEnCasa(Audio audio,
                        DVDPlayer dvdPlayer,
                        CDPlayer cdPlayer,
                        LucesTeatro lucesTeatro,
                        Proyector proyector,
                        JTextArea consola){

        this.audio=audio;
        this.dvdPlayer=dvdPlayer;
        this.cdPlayer=cdPlayer;
        this.lucesTeatro=lucesTeatro;
        this.proyector=proyector;
        this.consola=consola;
    }
    
    public void VerPelicula(){
        consola.setText(consola.getText()+"\n- - - - - - Iniciar Pelicula - - - - - -");
        dvdPlayer.IniciarLectura();
        proyector.IniciarProyeccion();
        audio.IniciarAudio();
        lucesTeatro.lucesOFF();
        consola.setText(consola.getText()+"\n");
    }
    
    public void FinalizarPelicula(){
        consola.setText(consola.getText()+"\n- - - - - - Finalizar Pelicula - - - - - -");
        lucesTeatro.lucesON(); 
        audio.ApagarAudio();
        proyector.ApagarProyeccion();
        dvdPlayer.DetenerLectura();
        consola.setText(consola.getText()+"\n");
    }
    
    public void EscucharCD(){
        consola.setText(consola.getText()+"\n- - - - - - Iniciar CD - - - - - -");
        cdPlayer.IniciarLectura();
        audio.IniciarAudio();
        consola.setText(consola.getText()+"\n");
    }
    
    public void FinalizarCD(){
        consola.setText(consola.getText()+"\n- - - - - - Apagar CD - - - - - -");
        audio.ApagarAudio();
        cdPlayer.DetenerLectura();
        consola.setText(consola.getText()+"\n");
    }
    
}
