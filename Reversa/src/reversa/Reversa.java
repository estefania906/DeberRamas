/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversa;

import java.util.Scanner;

/**
 *
 * @author Estefi Mantilla
 */
public class Reversa {

      private int num1;
  private int division;
  private int inversor = 0;

    Scanner teclado = new Scanner(System.in);
    
     public void consultar(){
    
   System.out.println("Ingrese 1 número: ");        
   num1=teclado.nextInt();
    
     }
     
     public void revertir(){
    
   while (num1 > 0){
   
       division=num1 %10;
       inversor = inversor * 10 + division;
       num1/=10;

   }
   
   System.out.println("El numero invertido es: " + inversor); 
   
     }
     
     
     
    public static void main(String[] args) {
        // TODO code application logic here
    
     Reversa ejercicio = new Reversa();
        ejercicio.consultar();
       ejercicio.revertir();
        
    }
    
}
