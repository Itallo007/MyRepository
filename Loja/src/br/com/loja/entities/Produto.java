package br.com.loja.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto extends AbstractEntity{
    //Atributos
    private String referencia;
    private int quantidade;
    private float valorPago;
    private float valorVenda;
    private String nomeFornecedor;

    
    // Metodos
    
    // Para exibir somente a referência do produto na lista
    @Override
    public String toString(){
        return this.getReferencia();
    }
    
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    
}
