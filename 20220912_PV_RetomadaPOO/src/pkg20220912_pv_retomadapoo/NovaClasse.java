/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220912_pv_retomadapoo;

import javax.swing.JFrame;

/**
 *
 * @author ruhan
 */
public class NovaClasse extends JFrame {
    
    private int pontA, pontB;
    
    public NovaClasse(int w, int h){
        super("Titulo da Tela"); //Construtor da Classe Mae
        pontA = 0;
        pontB = 0;
        
        this.setSize(w, h);        
    }
       
    public int getPontA(){ //getter
        return pontA;
    }
    
    public void setPontA(int p){ //setter
        this.pontA = p;
    }
    
}
