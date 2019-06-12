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
public class CadastroProdutos {
    private RepositorioProdutos produtos;
    
    public CadastroProdutos(RepositorioProdutos rep){
        produtos = rep;
    }
    
    public void cadastrar(Produtos produto) throws PJCException{
        //HEEY. TEM QUE CRIAR O PRODUTO NO MAIN ANTES DE ADICIONAR
        if(!produtos.existe(produto.getCodigo())){
            produtos.inserir(produto);
        }else{
            throw new PJCException();
        }
    }
    
    public void remover(String codigo) throws PNEException {
        if(!produtos.existe(codigo)) {
            throw new PNEException();
        }
        produtos.remover(codigo);
    }
    
    public void atualizar(Produtos produto) throws PNEException {
        if(!produtos.existe(produto.getCodigo())) {
            throw new PNEException();
        }
        produtos.atualizar(produto);
    }
    
    public Produtos procurar(String codigo) throws PNEException{
        if(!produtos.existe(codigo)){
            throw new PNEException();
        }
        return produtos.procurar(codigo);
    }
}
