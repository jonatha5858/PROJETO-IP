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
public class RepositorioProdutosArray implements RepositorioProdutos {
    private Produtos[] produto;
    private int indice;
    
    public RepositorioProdutosArray(){
        produto = new Produtos[100];
        indice = 0;
    }
    
    public int getIndice(String codigo){
        int i = 0;
        boolean achou = false;
        while(!achou && i<this.indice){
            if(this.produto[i].getCodigo().equals(codigo)){
                achou = true;
            }else{
                i++;
            }
        }
        return i;
    }
    
    public Produtos procurar(String codigo){
        Produtos resposta = new Produtos();
        resposta = null;
        int i = this.getIndice(codigo);
        return this.produto[i];
    }
     
    public void inserir(Produtos prod){
        this.produto[this.indice] = prod;
        this.indice++;
    }
    
    public void remover(String codigo){
        this.indice--;
        produto[this.getIndice(codigo)] = produto[this.indice];
        produto[this.indice] = null;
    }
    
    public boolean existe(String codigo){
        int i = this.getIndice(codigo);
        return i != this.indice;
    }
    
    public void atualizar(Produtos prod) {
        produto[this.getIndice(prod.getCodigo())] = prod;
    }
       
}
