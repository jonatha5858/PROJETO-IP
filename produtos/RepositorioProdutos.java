/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author mas8
 */
public interface RepositorioProdutos {
    void inserir(Produtos produto);
    void remover(String codigo);
    void atualizar(Produtos produto);
    Produtos procurar(String codigo);
    boolean existe(String codigo);
}
