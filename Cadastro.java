/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Cadastro {
    
    public static void main(String [] arga){
        Aluno aluno1 = new Aluno("Marcos", 61998764453, "Ceilandia", 20);
        
        
        
     System.out.println("Nome do aluno: " + aluno1.nome);
     System.out.println("Telefone do aluno: " + aluno1.telefone);
     System.out.println("Endereco do aluno: " + aluno1.endereco);
     System.out.println("Nota do aluno: " + aluno1.nota);
     System.out.println("Media do aluno: " + aluno1.media);   
        
    }
}
    