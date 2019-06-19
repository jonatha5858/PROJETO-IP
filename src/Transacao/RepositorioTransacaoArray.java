package Transacao;

import excessoes.TransacaoNaoEncontradaException;

public class RepositorioTransacaoArray {
	
	public Transacao[] transacoes;
	private Transacao[] transacao;
	private int indice;
	

	public RepositorioTransacaoArray() {
		transacoes = new Transacao[50];
		for (int i = 0; i < transacoes.length; i++) {
			transacoes[i] = null;
		}
		
		transacao = new Transacao[50];
		for (int i = 0; i < transacao.length; i++) {
			transacao[i] = null;
		}
	}

	public void cadastrar (String CpfComprador, String CpfVendedor, String Produto, int Quantidade,double Preco)  {
		Transacao transac = new Transacao 
			(CpfComprador,CpfVendedor,Produto,Quantidade,Preco);
		inserir(transac);
	}

	/*public void inserir1(Transacao Transacao) {
		for (int i = 0; i < transacoes.length; i++) {
			if (transacoes[i] == null) {
				transacoes[i] = Transacao;
				return;
			}
		}
	}*/
	  //Metodo para inserir novas transacoes.
    //Caso tente inserir mais transacoes com o array cheio, o tamanho do array é alterado para receber mais produtos.
    public void inserir(Transacao transacao){
        if(this.indice==this.transacao.length) {
        	Transacao[]auxiliar = new Transacao[this.indice];
        	auxiliar = this.transacao;
        	indice++;
        	this.transacao = new Transacao[this.indice];
        	for(int i = 0; i < this.indice-1; i++) {
        		this.transacao[i] = auxiliar[i];
        	}
        	this.transacao[this.indice-1] = transacao;
        }else{
        	this.transacao[this.indice] = transacao;
        	this.indice++;
        }
    }

	/*public void Remover(String CPF) throws TransacaoNaoEncontradaException {
		for (int i = 0; i < transacoes.length; i++) {
			if (transacoes[i] != null) {
				if (transacoes[i].getCPFComprador() == CPF | transacoes[i].getCPFVendedor() == CPF) {
					transacoes[i] = null;
					return;
				}
			}
		}
		TransacaoNaoEncontradaException excecao;
		excecao= new TransacaoNaoEncontradaException(CPF);
		throw excecao;
	}*/
    
    
	 //Metodo para remover produtos.
    public void remover (String nome)
    throws TransacaoNaoEncontradaException{
        int auxiliar = this.getIndice(nome);
        if (auxiliar == this.indice) {
            throw new TransacaoNaoEncontradaException(nome);
        }else{
            this.indice--;
            this.transacao[auxiliar] = this.transacao[this.indice];
            this.transacao[this.indice] = null;

        }

    }

	/*public Transacao procurar1(String CPF) throws TransacaoNaoEncontradaException {
		for (int i = 0; i < transacoes.length; i++) {
			Transacao transacao = transacoes[i];
			if (transacao.getCPFComprador() == CPF | transacao.getCPFVendedor() == CPF) {
				return transacao;
			}
		}
		TransacaoNaoEncontradaException excecao;
		excecao= new TransacaoNaoEncontradaException(CPF);
		throw excecao;	
		}*/
    
    
	
	//Metodo para procurar por transacoes.
    public Transacao procurar(String nome)
    throws TransacaoNaoEncontradaException{
        Transacao resposta = null;
        int auxiliar = this.getIndice(nome);
        if(auxiliar == this.indice) {
            throw new TransacaoNaoEncontradaException(nome);
        }else{
            resposta = this.transacao[auxiliar];
        }
        return resposta;
    }
	 private int getIndice(String nome) {
		  String normal;
	        boolean achado = false;
	        int auxiliar = 0;
	        while((!achado) && (auxiliar < this.indice)){
	            normal = transacao[auxiliar].getNome();
	            if (normal.equals(nome)){
	                achado = true;
	            }else{
	                auxiliar = auxiliar + 1;
	            }
	        }
	        return auxiliar;
	}

	/*public boolean existe1 (String CPF) {
	    	Transacao trans = null;
	    	try
	    	{trans = procurar1 (CPF); }
	    	catch (TransacaoNaoEncontradaException e) {}
	    		if(trans !=null) {
	    			return true;
	    		}else {
	    			return false;
	    		}
	    		}*/
	 
	 
	 
	//metodo para ver se existe a transacao
	public boolean existe (String nome){
        int auxiliar = this.getIndice(nome);
        return (auxiliar !=this.indice);
    }
	
	
	
	 //Metodo para atualizar produtos.
    public void atualizar (Transacao transacao)
        throws TransacaoNaoEncontradaException {
        int auxiliar = this.getIndice(transacao.getNome());
        if (auxiliar == this.indice) {
            throw new TransacaoNaoEncontradaException(transacao.getNome());
        } else {
            this.transacao[auxiliar] = transacao;
        }
    }  		

	public String ToString() {
		String retorno = "";
		for (int i = 0; i < transacoes.length; i++) {
			Transacao transacao = transacoes[i];
			if (transacao != null) {
	            retorno += "\nCPF Comprador: " + transacao.getCPFComprador() +
	            		" - CPF Vendedor" 	 + transacao.getCPFVendedor() +
	            		"   Preco :" +transacao.getPreco() +
	                   "    produto : " +transacao.getProduto()+
	                   "    quantidade : " +transacao.getQuantidade();
			}
		}
		return retorno;
	}

}
