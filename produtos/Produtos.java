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
public class Produtos {
    private String nome;
    private String codigo;
    private float preco;
    private int cpfdovendedor;
    
    public Produtos(){
        this.nome = null;
        this.codigo = null;
        this.preco = 0;
        this.cpfdovendedor = 0;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    public void setCodigo(){
        this.codigo = codigo;
    }
    public void setPreco(){
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public float getPreco(){
        return this.preco;
    }
    public Vendedor getVendedor(){
        return RepositorioVendedores.procurar(this.cpfdovendedor);
    }
}
