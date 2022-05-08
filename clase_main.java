
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernes
 */
public class clase_main {
    
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        char respuesta;
        
        System.out.println("Ingrese un numero:");
        int a = s.nextInt();
        System.out.println("Ingrese un numero:");
        int b = s.nextInt();
        System.out.println("Ingrese la opcion de lo que desea: ");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicacion");
        System.out.println("D. Division");
        System.out.println("E. Salir");
        
        
        respuesta= s.next().toUpperCase().charAt(0);
        System.out.println("La respuesta de la suma que solicito es:");
        switch(respuesta)
        {
            case 'A':
                System.out.print(Ejercicio1.suma(a, b));
                break;
                
            case 'B':
                System.out.print(Ejercicio1.resta(a, b));
                break;
            case 'C':
                System.out.print(Ejercicio1.multi(a, b));
                break;
            case 'D':
                System.out.print(Ejercicio1.division(a, b));
                break;
            default: System.out.println("MUCHAS GRACIAS POR INTENTAR :D\n"); 
                break;
                
        }
        
    }
}    

        

