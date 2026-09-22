
import com.mycompany.malu.Escola;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria62977236
 */
public class Professor extends Escola{
    private double salario;
    private String contrato;
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
       this.salario = salario;
    }
    
    public String getContrato(){
        return this.contrato;
    }
    
    public void setContrato(String contrato){
       this.contrato = contrato;
    }
    public Professor(String nome,int telefone,String endereco,double salario, String contrato){
        super(nome, telefone, endereco);
         this.salario = salario;
         this.contrato = contrato;
    }
    
    @Override
    public void apresentar(){
    System.out.println("Olá, sou o professor(a).");
    }
}
