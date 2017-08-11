/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr01b.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Master
 */
public class Exr01b {

    public static float lerPonto(String ponto) throws IllegalArgumentException{
        try{
            String text = JOptionPane.showInputDialog("Digite " + ponto);
            float value = Float.parseFloat(text);
            return value;
        }catch(NullPointerException e){
            throw new IllegalArgumentException(ponto + " é valor obrigatório!");
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(ponto + " inválido!");
        }
    }
    
    public static void main(String[] args) {
        try{
           float x1 = lerPonto("x1");
           float y1 = lerPonto("y1");
           float x2 = lerPonto("x2");
           float y2 = lerPonto("y2");
           JOptionPane.showMessageDialog(null, Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
