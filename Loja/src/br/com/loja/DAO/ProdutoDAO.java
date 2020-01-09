package br.com.loja.DAO;

import br.com.loja.entities.Produto;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto>{
    
    // Aqui é tão complicado que o nome do metodo tá em inglês/português
    public List<Produto> findByReferencia(String referencia){
        String query = "select p from Produto p where p.referencia = '" + referencia + "'";
         //Metodo createQuery permite que se crie comando sql manualmente.      
        return entityManager.createQuery(query).getResultList();
        //f333333333333333333333333
    }
}
