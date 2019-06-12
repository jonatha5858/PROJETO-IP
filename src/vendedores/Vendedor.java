package Contas;

import usuarios.*;
import produtos.*;

public class Vendedor extends Usuario{
	
	private Vendedor next;
	
	public Vendedor(String nome, String CPF, Estado estado, double dinheiro) {
		setNome(nome);
		setCPF(CPF);
		setEstado(estado);
		setDinheiro(dinheiro);
	}
	
	public void Operar(Produtos produto) {
		System.out.println("Anunciar o produto: " + produto.getNome());
	}
	
	public void Operar(String nome_produto, double preco, int quantidade) {
		System.out.println("Anunciar o produto: " + nome_produto);
		Anunciar(nome_produto, preco, quantidade);
	}
	
	public void Anunciar (String nome_produto, double preco, int quantidade) {
		Produtos produto = new Produtos(nome_produto, getCPF(), preco, quantidade);
	}
	
	public Vendedor getNext() {
		return next;
	}
	public void setNext(Vendedor next) {
		this.next = next;
	}

}
