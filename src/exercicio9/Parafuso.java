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
public class Parafuso extends Produto {
    
    private double comprimento;
    private double diametro;
    
    Parafuso(String codigo, String nome, String descricao, double preco, double comprimento, double diametro){
        super(codigo, nome, descricao, preco);
        this.setComprimento(comprimento);
        this.setDiametro(diametro);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double calcularPrecoFinal(){
        double precoFinal = this.getPreco() + (0.15 * this.getPreco());
            return precoFinal;
    }
    
    public String imprimirDados(){
        String dados = "codigo:"+this.getCodigo()+"\nnome:"+this.getNome()+"\ndescrição:"+this.getDescricao()+
                "\npreço:"+this.getPreco()+"\ncomprimento:"+this.getComprimento()+"\ndiametro:"+this.getDiametro();
        return dados;
    }
    
}
