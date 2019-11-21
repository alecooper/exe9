/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

public class TestaProfessores {
    public static void main(String[] args) {
        ProfessorIntegral p1 = new ProfessorIntegral("Alexandre");
        System.out.println(p1.calcularSalarioLiquido());
        ProfessorHorista ph1 = new ProfessorHorista("Cardoso");
        System.out.println(ph1.calcularSalarioLiquido());
    }
}
