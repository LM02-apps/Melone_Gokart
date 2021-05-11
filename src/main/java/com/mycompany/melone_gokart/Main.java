/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melone_gokart;

import java.util.ArrayList;

/**
 *
 * @author Melone
 */
public class Main {
    
    
    public static Semaforo spogliatoio = new Semaforo(2); 
    public static Semaforo pista = new Semaforo(4);
    public static ArrayList<Classifica> classifica=new ArrayList<Classifica>();
    
    public static void main(String[] args) throws InterruptedException
    {
        Pilota p1=new Pilota();
        Pilota p2=new Pilota();
        Pilota p3=new Pilota();
        Pilota p4=new Pilota();
        Pilota p5=new Pilota();
        Pilota p6=new Pilota();
        Pilota p7=new Pilota();
        Pilota p8=new Pilota();
        
        p1.setName("Pilota 1");
        p2.setName("Pilota 2");
        p3.setName("Pilota 3");
        p4.setName("Pilota 4");
        p5.setName("Pilota 5");
        p6.setName("Pilota 6");
        p7.setName("Pilota 7");
        p8.setName("Pilota 8");
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();
        
        System.out.println("La Classifica Finale In Base Al Tempo E' La Seguente:");
        Ordina();
        
        for(int i = 0; i < classifica.size(); i++)
        {
            System.out.println(classifica.get(i).toString());
        }
        
        
        System.out.println("Fine Gara");
    }
    
    private static void Ordina() //Metodo che Orina la classifica in base al tempo
    {
       int i = 0;
        int j = 0;
        int min = 0;
        Classifica temp;
         
        for (i = 0; i < classifica.size(); i++)
          {
                 min = i;

             for (j = i + 1; j < classifica.size(); j++)
            {
                if (classifica.get(j).getTempo() < classifica.get(min).getTempo())
                {
                    min = j;
                }
            }
                temp = classifica.get(min);
                classifica.set(min, classifica.get(i)); 
                classifica.set(i, temp);
          }
    }
}
