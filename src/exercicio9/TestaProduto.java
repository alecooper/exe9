/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;


public class TestaProduto {
    public static void main(String[] args) {
        Motor m1 = new Motor("123-478", "cat", "v3", 650.00, 500.0, 3000.0);
        Parafuso p1 = new Parafuso("123-589", "jd", "v6", 3.00, 5.0, 2.0);
        
        System.out.println(m1.imprimirDados()+"\npreco final:"+m1.calcularPrecoFinal());
        System.out.println("");
        System.out.println(p1.imprimirDados()+"\npreco final:"+p1.calcularPrecoFinal());
        
    }
}
