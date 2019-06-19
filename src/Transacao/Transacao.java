package Transacao;

import excessoes.QuantidadeInvalidoException;

public class Transacao {

	
	private Transacao next;
	public static final int length = 0;
   String cpf_comprador,cpf_vendedor,produto,nome;
   int qntd;
   double preco;
	public Transacao(String cpf_comprador, String cpf_vendedor, String produto,int Quantidade,double preco) {
		next = null;
		this.cpf_comprador=cpf_comprador;
		this.cpf_vendedor=cpf_vendedor;
		this.produto=produto;
		this.qntd=Quantidade;
		this.preco=preco;
	     this.nome = nome;
	        if (Quantidade > 0){
	            this.qntd = Quantidade;
	        }else {
	            try {
					throw new QuantidadeInvalidoException();
				} catch (QuantidadeInvalidoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	



	public void setNext(Transacao transacao) {
		next = transacao;
	}

	public Transacao getNext() {
		return next;
	}

	public String getCPFComprador() {	
		
		return cpf_comprador;
	}

	public String getCPFVendedor() {
		return cpf_vendedor;
	}

	public String getProduto() {
		return produto;
	}

	
	public int getQuantidade() {
		return qntd;
	}
	public double getPreco() {
		return preco;
	}

	public String getNome() {
		String nome = null;
		// TODO Auto-generated method stub
		return nome;
	}
   

    public double getValor() {
        return qntd;
    }

    

    public String getdescricao() {
        return getdescricao();
    }
}


