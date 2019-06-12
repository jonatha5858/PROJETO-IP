package Transacao;

public class Transacao {

	
	private Transacao next;
	public static final int length = 0;
   String cpf_comprador,cpf_vendedor,produto;
   int qntd;
   double preco;
	public Transacao(String cpf_comprador, String cpf_vendedor, String produto, int qntd,double preco) {
		next = null;
		this.cpf_comprador=cpf_comprador;
		this.cpf_vendedor=cpf_vendedor;
		this.produto=produto;
		this.qntd=qntd;
		this.preco=preco;
	}

	public void setNext(Transacao transacao) {
		next = transacao;
	}

	public Transacao getNext() {
		return next;
	}

	public String get_CPFComprador() {	
		
		return cpf_comprador;
	}

	public String get_CPFVendedor() {
		return cpf_vendedor;
	}

	public String get_produto() {
		return produto;
	}

	
	public int get_quantidade() {
		return qntd;
	}
	public double get_preco() {
		return preco;
	}

}
