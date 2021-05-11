/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melone_gokart;

import java.util.Random;

/**
 *
 * @author Melone
 */
public class Pista
{
    
    Semaforo pilotiInPista;

    public Pista() 
    {

    }

    public Pista(Semaforo pilotiInPista) 
    {
        this.pilotiInPista = pilotiInPista;
    }
    
    
    public boolean EntrataPista() throws InterruptedException
    {
        pilotiInPista.P();
        System.out.println("Il pilota" + Thread.currentThread().getName() + " è entrato nel circuito");
        Giri();
        pilotiInPista.V();
        
        return false;
    }
    public void Giri() throws InterruptedException
    {
        int i=0;
        int n=0;
        long tempo=System.currentTimeMillis();
        Random r=new Random();
        
        for (;i<Pilota.contatoreGiri;i++)
        {
            n=r.nextInt(5000-1000+1)+1000;
            System.out.println("Il pilota "+Thread.currentThread().getName()+" è al giro n° "+i);
            Thread.sleep(n);
        }
        tempo=System.currentTimeMillis()-tempo;
        tempo /=1000;
        
        Classifica classifica=new Classifica(tempo, Thread.currentThread().getName());
        Main.classifica.add(classifica);
        System.out.println("Il pilota "+ Thread.currentThread().getName()+" è uscito dalla pista");
    }
    
    
}
