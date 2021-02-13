
package com.mycompany.nuevoproyecto;

import java.util.Scanner;

public class quintoPunto {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    int factorial = 1;
        
    System.out.println ("Por favor ingrese un numero:  ");
    int num = teclado.nextInt();
    
    for (int i = 1; i <= num; i++){
        factorial = factorial * i;
    }
    System.out.println("el factorial de " + num + " es: " + factorial);
    }
    
}
