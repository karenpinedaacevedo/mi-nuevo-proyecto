
package com.mycompany.nuevoproyecto;

import javax.swing.JOptionPane;

public class segundoPunto {
    
public static void main(String[] args) {
    
    String Frase = JOptionPane.showInputDialog(null, "Ingresa la frase o palabra.");
    int i = 0;
    int j = Frase.length()-1;
    boolean F = false;
    
    while((i<j) && (!F)){
        if (Frase.toLowerCase().charAt(i)==Frase.toLowerCase().charAt(j)){
        i++;
        j--;
        
        }else{
            
            F = true;
        }
    }
    if(!F){
        JOptionPane.showMessageDialog(null, Frase + " es un palindromo.");
    
    }else{

        JOptionPane.showMessageDialog(null, Frase + " no es un palindromo.");
    }
}
}



