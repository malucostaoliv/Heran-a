/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Escola {
    
  private String nome;
  private int telefone;
  private String endereco;
  
  public String getNome(){
        return this.nome;
    }
  
   public void setNome(String nome){
       this.nome = nome;
       
    }
   
   public int getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(int telefone){
       this.telefone = telefone;
       
    }
    
     public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
       this.endereco = endereco;
       
    }
    
    public Escola(String nome, int telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public void apresentar(){}
}
