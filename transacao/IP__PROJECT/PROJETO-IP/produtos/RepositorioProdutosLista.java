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
class RepositorioProdutosLista implements RepositorioProdutos{
    private Produtos produto;
    private RepositorioProdutosLista proximo;
    
    public RepositorioProdutosLista(){
        this.produto = null;
        this.proximo = null;
    }
    public void inserir(Produtos produto){
        if(this.produto == null){
            this.produto = produto;
            this.proximo = new RepositorioProdutosLista();
        }else{
            this.proximo.inserir(produto);
        }
    }
    
    public void remover(String codigo) {
        if(this.produto.getCodigo().equals(codigo)){
            this.produto = this.proximo.produto;
            this.proximo = this.proximo.proximo;
        }
        else {
            this.proximo.remover(codigo);
        }
    }
    
    public boolean existe(String codigo) {
        if(this.produto.getCodigo().equals(codigo)){
            return true;
        }else if(this.produto != null){
            this.proximo.existe(codigo);
        }
        return false;
    }
    
    public Produtos procurar(String codigo) {
        Produtos resposta = new Produtos();
        if(this.produto.getCodigo().equals(codigo)){
            resposta = this.produto;
        }else {
            this.proximo.procurar(codigo);
        }
        return resposta;
    }
    
    public void atualizar(Produtos prod) {
        Produtos antigo = this.procurar(prod.getCodigo());
        antigo = prod;
    }
}
