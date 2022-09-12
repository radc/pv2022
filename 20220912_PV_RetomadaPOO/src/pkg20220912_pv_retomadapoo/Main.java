/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220912_pv_retomadapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author ruhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // NovaClasse nc = new NovaClasse(500,200);
       // nc.setVisible(true);        
       
       /*
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
       int soma = a + b;
       JOptionPane.showMessageDialog(null, "A soma é: " + soma, "RESULTADO", JOptionPane.WARNING_MESSAGE);
       
        int resposta = JOptionPane.showConfirmDialog(null, "Gostaria de Instalar o Baidu?");
        if(resposta == 0){
            System.out.println("Instalando Baidu");
        }
        */
        
       double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
       double imc = peso / Math.pow(altura, 2);
       
       if(imc < 18.5){                          //"Seu IMC está baixo: "+ imc
           JOptionPane.showMessageDialog(null, String.format("Seu IMC está baixo: %.2f", imc), "IMC", JOptionPane.WARNING_MESSAGE);
       }else {
           if (imc >= 25){
               JOptionPane.showMessageDialog(null, String.format("Seu IMC está alto: %.2f", imc),"IMC", JOptionPane.WARNING_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(null, "Seu IMC está bom: " + imc, "IMC", JOptionPane.PLAIN_MESSAGE);
           }
           
           
       }
    }
    
}
