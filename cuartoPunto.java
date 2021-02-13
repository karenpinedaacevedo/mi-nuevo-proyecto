
package com.mycompany.nuevoproyecto;

import java.util.*;
public class cuartoPunto {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int M;
        int N;
        int suma = 0;
        int resultado = 0;
        
        System.out.println("Ingrese la base: ");
        M = leer.nextInt();
        System.out.println("Ingrese el exponente: ");
        N = leer.nextInt();
        
        resultado = potencia(M,N);
        System.out.println("El resultado es: " + resultado);
    }
    public static int potencia(int M,int N){
        int resultado = 1;
        
        for(int i = 0; i < N; i++){
            resultado = multiplicacion(resultado,M); 
        }
        return resultado; 
    }
    public static int multiplicacion(int resultado, int M){
        int suma = 0; 
        
        for(int i = 0; i < resultado; i++){
            suma = suma + M;  
        }
        return suma; 
    }
}
    
    
