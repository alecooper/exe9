/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author NOTEBOOK
 */
public class ProfessorIntegral extends Professores {
    private double salarioSemana;
    
    ProfessorIntegral(String nome){
        super(nome);
        this.setSalarioSemana(350.0);
    }

    public double getSalarioSemana() {
        return salarioSemana;
    }

    public void setSalarioSemana(double salarioSemana) {
        this.salarioSemana = salarioSemana;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido = (this.getSalarioSemana() * 4) - (0.11 * this.getSalarioSemana());
        return salarioLiquido;
    }
    
    
    
}
