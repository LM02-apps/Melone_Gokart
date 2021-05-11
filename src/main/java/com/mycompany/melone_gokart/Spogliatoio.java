/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melone_gokart;

/**
 *
 * @author Melone
 */
public class Spogliatoio 
{
    Semaforo spogliatoio;
    public Spogliatoio(Semaforo semaforo1)
    {
        
        spogliatoio=semaforo1;
    }
    
    public boolean EntrataSpogliatoio(boolean indumenti) throws InterruptedException
    {
        spogliatoio.P();
        System.out.println("Il pilota "+Thread.currentThread().getName()+" è entrato nello spogliatoio");
        if (indumenti==false)
        {
            indumenti=true;
            Thread.sleep(3000);
        }
        else 
        {
            indumenti=false;
            Thread.sleep(3000);
        }
        System.out.println("Il pilota "+ Thread.currentThread().getName()+ " è uscito dallo spogliatoio");
        spogliatoio.V();
        
        return indumenti;
        
    }
}
