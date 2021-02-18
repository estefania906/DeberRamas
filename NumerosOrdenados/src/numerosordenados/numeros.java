/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosordenados;

import java.util.Scanner;

/**
 *
 * @author Estefi Mantilla
 */
public class numeros {
    
    private Double numero1;
    private Double numero2;
    private Double numero3;

    Scanner teclado = new Scanner(System.in);
    
     public void consultar(){
    
   System.out.println("Ingrese 3 números para ser ordenados de menor a mayor: ");        
   numero1=teclado.nextDouble();
    numero2=teclado.nextDouble();
    numero3=teclado.nextDouble();
  
     }
     
     public void calcular(){
     System.out.println("Los numeros ordenados de menor a mayor son: "); 
         
        if (numero1>numero2 && numero1>numero3){
        
        if (numero2>numero3){
            
             System.out.println(numero3);
             System.out.println(numero2);
             System.out.println(numero1);
             
             
        }    
        
         else if (numero3> numero2){
        
            System.out.println(numero2);
             System.out.println(numero3);
             System.out.println(numero1);
            
        }
         
        }
         else if (numero2>numero1 && numero2>numero3){
            
            if (numero1>numero3){
            System.out.println(numero3);
             System.out.println(numero1);
             System.out.println(numero2);
            }
            else if(numero3>numero1){
            System.out.println(numero1);
             System.out.println(numero3);
             System.out.println(numero2);
            
            }
            }
        else if (numero3>numero1 && numero3>numero2){
        
        if (numero1>numero2){
            System.out.println(numero2);
             System.out.println(numero1);
             System.out.println(numero3);
            }
            else if(numero2>numero1){
            System.out.println(numero1);
             System.out.println(numero2);
             System.out.println(numero3);
            
            }
        
        }
    }
    
       public static void main(String[] args) {
        // TODO code application logic here
   
    
        numeros num1 = new numeros();
        num1.consultar();
       num1.calcular();
        
       
    }
    
}
