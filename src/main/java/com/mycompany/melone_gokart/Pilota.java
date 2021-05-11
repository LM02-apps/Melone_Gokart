/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.melone_gokart;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Melone
 */
public class Pilota extends Thread{
    //entra in Spogliatoio (METODO), controlla se c'è posto
    //if posto=occupato aspetta, else entra, esce dallo spogliatoio
    //I kart sono nella pista, if tuttiikart=occupati aspetta, else prendine uno
    //fa 15 giri, poi lascia Pista
    //ritorna nello spogliatoio
    public static int contatoreGiri=15;
    boolean indumenti=false;
    boolean finethread=true;
    
    public Pilota()
    {
    }
    
    public boolean isIndumenti()
    {
        return indumenti;
        
    }
    public void setIndumenti(boolean indumenti)
    {
        this.indumenti=indumenti;
    }
    
    public void run()
            
    {
        while(finethread)
        {
            Spogliatoio s=new Spogliatoio(Main.spogliatoio);
            Pista c=new Pista(Main.pista);
            try
            {
                this.indumenti=s.EntrataSpogliatoio(this.indumenti);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Pilota.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (this.indumenti==true)
            {
                try
                {
                    finethread=c.EntrataPista();
                    this.indumenti=s.EntrataSpogliatoio(this.indumenti);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Pilota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
    
    
}
