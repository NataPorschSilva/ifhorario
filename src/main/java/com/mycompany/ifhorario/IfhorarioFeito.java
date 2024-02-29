
package com.mycompany.ifhorario;

import java.util.Scanner;

public class Ifhorario {

    public static void main(String[] args) {
        
              
       Scanner horario = new Scanner (System.in);
       
       int hora;
       
        System.out.println("Digite qual horário:");
                hora = horario.nextInt();
        
        if (hora < 12){
            System.out.println("Bom dia!");
            
        }else{ 
            if (hora < 18)
            System.out.println("Boa tarde!");
        
         else{
            System.out.println("Boa noite!");    
                }
        }
    }    
}        
        
                       
        
        
        
        
        
        
    

