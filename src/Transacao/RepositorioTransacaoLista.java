package Transacao;
import java.net.InterfaceAddress;

import excessoes.TransacaoNaoEncontradaException;

public class RepositorioTransacaoLista implements RepositorioTransacao{
	    private Transacao primeiro, ultimo;
	    private int length;
	    private Transacao transacao;
		private Object proximo;
	    
	    public RepositorioTransacaoLista() {
	        primeiro = new Transacao(null, null, null, 0, 0);
	        // VARIAVEL ARBITRARIA
	        primeiro.setNext(null);
	        ultimo = primeiro;
	        length = 0;
	        this.transacao = null;
	        this.proximo = null;
	    }
	   /* public void cadastrar (String CpfComprador, String CpfVendedor, String Produto, int Quantidade,double Preco)  {
			Transacao transac = new Transacao 
				(CpfComprador,CpfVendedor,Produto,Quantidade,Preco);
			inserir1(transac);
		}*/
	    
	    public void inserir(Transacao transacao) {
	        ultimo.setNext(transacao);
	        ultimo = transacao;
	        length++;
	    }
	    
	    
	    //Metodo para inserir novos produtos.
	   /* public void inserir(Transacao transacao) {
	        if(this.transacao==null){
	            this.transacao = transacao;
	            this.proximo = new RepositorioTransacaoLista();
	        }else{
	            this.proximo.inserir(transacao);
	        }
	    }*/
	    
	    public void remover(String CPF) throws TransacaoNaoEncontradaException {
	        Transacao transacao = primeiro;
	        while(transacao.getNext() != null) {
	            if(transacao.getCPFComprador() == CPF | transacao.getCPFVendedor() == CPF) {
	                transacao.setNext(transacao.getNext().getNext());
	                return;
	            }
	            
	            transacao = transacao.getNext();
	        }
	        
	        TransacaoNaoEncontradaException excecao;
			excecao= new TransacaoNaoEncontradaException(CPF);
			throw excecao; 
	    }
	    
	    
	    
	  //Metodo para remover transacoes.
	    /*public void remover (String nome)
	    throws TransacaoNaoEncontradaException{
	        if(this.transacao == null){
	            throw new TransacaoNaoEncontradaException(nome);
	        }else{
	            if (this.transacao.getNome().equals(nome)){
	                this.transacao = this.proximo.transacao;
	                this.proximo = this.proximo.transacao;
	            }else{
	                this.proximo.remover(nome);
	            }
	        }
	        }*/
	    
	    
	    
	    public Transacao procurar(String CPF) throws TransacaoNaoEncontradaException {
	        Transacao transacao = primeiro;
	        while(transacao.getNext() != null) {
	            transacao = transacao.getNext();
	            
	            if(transacao.getCPFComprador() == CPF | transacao.getCPFVendedor() == CPF) {
	               return transacao;
	            }
	        }
	        
	        TransacaoNaoEncontradaException excecao;
			excecao= new TransacaoNaoEncontradaException(CPF);
			throw excecao; 
	    }
	    
	    
	  //Metodo para procurar por produtos.
	  /*  public Transacao procurar(String nome)
	    throws TransacaoNaoEncontradaException{
	        if(this.transacao == null){
	            throw new TransacaoNaoEncontradaException(nome);
	        }else{
	            if(this.transacao.getNome().equals(nome)){
	                return this.transacao;
	            }else{
	                return this.proximo.transacao(nome);
	            }
	        }
	    }*/
	    
	    public boolean existe (String CPF) {
	    	Transacao trans = null;
	    	try
	    	{trans = procurar (CPF); }
	    	catch (TransacaoNaoEncontradaException e) {}
	    		if(trans !=null) {
	    			return true;
	    		}else {
	    			return false;
	    		}
	    		}
	    		
	  //Metodo para checar a existencia de produtos.
	   /* public boolean existe (String nome){
	        if(this.transacao==null){
	            return false;
	        }else{
	            if(this.transacao.getNome().equals(nome)){
	                return true;
	            }else{
	                return this.proximo.existe(nome);
	            }
	        }
	    }*/
	    
	    
	    //Metodo para atualizar produtos.
	  /*  public void atualizar (Transacao transacao)
	        throws TransacaoNaoEncontradaException{
	        if(this.transacao == null){
	            throw new TransacaoNaoEncontradaException(transacao.getNome());
	        }else if(this.transacao.getNome().equals(transacao.getNome())){
	                this.transacao = transacao;
	        }else{
	                this.proximo.atualizar(transacao);
	            }
	        }*/

	    		
	    	
	    
	    
	    public String ToString() {
	    	System.out.println(length);
	    	
	        String retorno = "";
	        Transacao transacao = primeiro.getNext();
	        while(transacao != null) {
	            retorno += "\nCPF Comprador: " + transacao.getCPFComprador() +
	            		" - CPF Vendedor" 	 + transacao.getCPFVendedor() +
	            		"   Preco :" +transacao.getPreco() +
	                   "    produto : " +transacao.getProduto()+
	                   "    quantidade : " +transacao.getQuantidade();
	            transacao = transacao.getNext();
	        }
	        return retorno;
	    }

		
		public void atualizar(Transacao transacao) throws TransacaoNaoEncontradaException {
			// TODO Auto-generated method stub
			 //       if(this.transacao == null){
			   //         throw new TransacaoNaoEncontradaException(transacao.getNome());
			     //   }else if(this.transacao.getNome().equals(transacao.getNome())){
			       //         this.transacao = transacao;
			        //}else{
			          //      this.proximo.atualizar(transacao);
			            //}
			 
		
			 }
		}

		
	

