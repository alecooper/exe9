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
public class Motor extends Produto {
    
    private double potencia;
    private double rpm;
    
    Motor(String codigo, String nome, String descricao, double preco, double potencia, double rpm){
        super(codigo, nome, descricao, preco);
        this.setPotencia(potencia);
        this.setRpm(rpm);
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    public double calcularPrecoFinal(){
        double precoFinal = this.getPreco() - (0.05 * this.getPreco());
            return precoFinal;
    }
    public String imprimirDados(){
        String dados = "codigo:"+this.getCodigo()+"\nnome:"+this.getNome()+"\ndescrição:"+this.getDescricao()+
                "\npreço:"+this.getPreco()+"\npotecia:"+this.getPotencia()+"\nrpm:"+this.getRpm();
        return dados;
    }
    
}
