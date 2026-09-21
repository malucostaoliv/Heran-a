/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Aluno {
    private double nota;
    private double media;
    
    public double getNota(){
        return this.nota;
    }
    
    public void setNota(double nota){
       this.nota = nota;
       
    }
    
    public double getMedia(){
        return this.media;
    }
    
    public void setMedia(double media){
       this.media = nota/4;
       
    }
}
