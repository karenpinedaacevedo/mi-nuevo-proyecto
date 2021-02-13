

package com.mycompany.nuevoproyecto;
import java.util.Scanner;
public class nuevoProyecto {
 
    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);

    System.out.println ("Por favor ingrese la cantidad de numeros que desea digitar: ");
    int n = leer.nextInt();

    int array [] = new int [n];

    for (int i = 0; i < array.length; i++) {
        System.out.print("Ingrese dato "+(i+1)+": ");
        array [i] = leer.nextInt();
        }

    int mayor;
    int menor;

    mayor = menor = array [0];

    for (int i = 0; i < array.length; i++) {
        
        if(array [i] > mayor) {
            mayor = array[i];
        }
            
        if(array[i]<menor) {
            menor = array[i];
        }
    }
        
    System.out.println("El numero mayor es: " + mayor);
    System.out.println("El numero menor es: " + menor);
    
    }

}
