/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.tads.poo.biblioteca.usuario;

import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;

/**
 *
 * @author pablopc
 */
public class Usuario {
    private int codUsuario;
    private double valorPagar;
    private String nome, endereco, cpf, senha, ativo;
    private ItemAcervo item;

    public String getAtivo(){
        return ativo;
    }
    
    public void setAtivo(String ativo){
        this.ativo = ativo;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ItemAcervo getItem() {
        return item;
    }

    public void setItem(ItemAcervo item) {
        this.item = item;
    }
        
    public Usuario(int codUsuario,String ativo, String nome, String endereco, String cpf) {
        this.codUsuario = codUsuario;
        this.ativo = ativo;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public Usuario (){
    
    }
        
    void pagar(){
    
    }
    
    ItemAcervo escolherItemAcervo(){
        return null;
    }
}
