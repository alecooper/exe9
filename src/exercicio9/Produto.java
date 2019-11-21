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
public abstract class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    
    Produto(String codigo, String nome, String descricao, double preco){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public abstract double calcularPrecoFinal();
    public abstract String imprimirDados();
    
}
