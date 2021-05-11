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
public class Semaforo 
{
    int valore;  // si inizializza il valore del semaforo
    
    public Semaforo(int valore)  //costruttore
     {
        this.valore = valore;
     }
    
    synchronized public void P()
    {
        while(valore == 0)  // Qui controlliamo se la risorsa è disponibile. Se non ci sono risorse il thread verrà sospeso, altrimenti verrà decrementata la risorsa.
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
            }
        }
        
        valore--;
    }
    
    synchronized public void V()
    {
        valore++;       //Qui il semaforo quando viene incrementato, significa che è stata liberata una risorsa.
        notify();       //Quindi risveglia il thread in coda.
    }
}
