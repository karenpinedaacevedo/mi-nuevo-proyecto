
package com.mycompany.nuevoproyecto;

import java.util.Scanner;

public class tercerPunto {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    int resultado = 0;
    
    System.out.println ("Por favor ingrese un numero:  ");
    int n1 = teclado.nextInt();
    
    System.out.println ("Por favor ingrese otro numero:  ");
    int n2 = teclado.nextInt();
    
        while (n2 != 0){
            resultado = resultado + n1;
            n2 = n2 - 1;
        }
        System.out.println("el resultado de los dos numeros es: " + resultado);
    }
    
}
