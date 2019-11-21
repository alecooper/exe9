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
public class ProfessorHorista extends Professores{
    private double valorHora;
    ProfessorHorista(String nome){
        super(nome);
        this.setValorHora(50.0);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido = ((this.getValorHora() * 4) * 5) - (0.05 * this.getValorHora());
        return salarioLiquido;
    }
}
