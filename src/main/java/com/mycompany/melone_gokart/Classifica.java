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
public class Classifica 
{
    private long tempo;
    private String nomepilotathread;

    public Classifica(long tempo, String nomepilotathread) 
    {
        this.tempo = tempo;
        this.nomepilotathread = nomepilotathread;
    }
    public String toString()
    {
        String s="Pilota:"+nomepilotathread+" ha classificato un tempo pari a "+ tempo;
        return s;
    }
        public long getTempo()
    {
        return tempo;
    }
    
    public void setTempo(long tempo)
    {
        this.tempo=tempo;
    }
}
