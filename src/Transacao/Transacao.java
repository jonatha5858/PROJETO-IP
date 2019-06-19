package Transacao;

import excessoes.QuantidadeInvalidoException;

public class Transacao {

	
	private Transacao next;
	public static final int length = 0;
   String CpfComprador,CpfVendedor,produto,nome;
   int quantidade;
   double preco;
	public Transacao(String CpfComprador, String CpfVendedor, String produto,int Quantidade,double preco) {
		next = null;
		this.CpfComprador=CpfComprador;
		this.CpfVendedor=CpfVendedor;
		this.produto=produto;
		this.quantidade=Quantidade;
		this.preco=preco;
	     this.nome = nome;
	        if (Quantidade > 0){
	            this.quantidade = Quantidade;
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
		
		return CpfComprador;
	}

	public String getCPFVendedor() {
		return CpfVendedor;
	}

	public String getProduto() {
		return produto;
	}

	
	public int getQuantidade() {
		return quantidade;
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
        return quantidade;
    }

    

    public String getdescricao() {
        return getdescricao();
    }
}


