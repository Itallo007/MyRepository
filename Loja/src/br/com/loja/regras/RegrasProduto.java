/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.regras;

import br.com.loja.DAO.ProdutoDAO;
import br.com.loja.entities.Produto;
import java.util.List;

/**
 *
 * @author dipirona
 */
public class RegrasProduto {
    
    private ProdutoDAO produtoDao = new ProdutoDAO();
    
    public List<Produto> buscarProduto(String string){
        if(string.equals("") || string.length() < 3){
            return null;
        }else {
            
            List<Produto> resultado;
            
            resultado = this.produtoDao.findByReferencia(string);
            return resultado;
        }
    }
    
    public List<Produto> buscarTodos(){
        return this.produtoDao.findAll();
    }
    
    public void apagarUm(Produto x){
        this.produtoDao.delete(x);
    }
    
    public boolean jaExiste(Produto x){
        if(x == produtoDao.getById(x.getId())){
            return true;
        }else{
            return false;
        }
    }
    
    public void salvar(Produto x){
        this.produtoDao.save(x);
    }
    
    public void atualizar(Produto x){
        this.produtoDao.update(x);
    }
}
