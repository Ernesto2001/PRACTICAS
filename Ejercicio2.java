
import java.util.Random;
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
public class Ejercicio2 {
    
    public static void jueg()
    {
        String[] palabras = {"Mapache","Oso","Caballo","Perro","Gato","Serpiente"};
        final int Intentos= 7;
        int intentos_realizados =0;
        int aciertos =0;
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        char r;
        Random rnd = new Random();
        
        do
        {
            int aa=rnd.nextInt(6);
            char[] l = letras(palabras[aa].toLowerCase());
            char[] l2 = letras(palabras[aa]);
            char[] tr = new char[l.length];
            for(int i =0; i<tr.length;i++)
            {
                tr[i] = '-';
            }
            
            System.out.println("Adivina la palabra");
            
            while(Intentos>intentos_realizados)
            {
                imprimeOculta(tr);
                System.out.println("\nIntroduce una letra");
                r = s.next().toLowerCase().charAt(0);
                for(int i=0;i<l.length;i++)
                {
                    if(l[i]==r)
                    {
                        tr[i] = l[i];
                        l[i] =' ';
                        aciertos++;
                    }
                }
                intentos_realizados++;
            }
            if(aciertos==tr.length)
            {
                System.out.println("\nFelicidades... Ganaste");
                imprimeOculta(tr);
            }else
            {
                System.out.println("\nFracasaste... Te he vencido");
                for(intentos_realizados=0;intentos_realizados<l2.length-1;intentos_realizados++)System.out.print(l2[intentos_realizados]);
            }
            intentos_realizados=0;
            aciertos=0;
            r = pregunta("\n\nQuieres volver a jugar?", s);
        }while(r !='n');
    }
    
    private static char[] letras(String pp)
    {
        char[] l;
        l = new char[pp.length()-1];
        for(int i =0; i<pp.length()+1;i++)
        {
            l[i] = pp.charAt(i);
        }
        return l;
    }
    
    private static void imprimeOculta(char[] tr)
    {
        for(int i = 0; i<tr.length;i++)
        {
            System.out.print(tr[i]+" ");
        }
    }
    
    public static char pregunta(String m, Scanner teclado)
    {
        char resp;
        System.out.println(m + "(s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while(resp != 's' && resp != 'n')
        {
            System.out.println(m + "(s/n)");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}

