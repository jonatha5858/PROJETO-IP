package Repositorios;

import Exception.TransacaoNaoEncontrada_Exception;
import Transacao.Transacao;

public class Repositorio_Array_Transacao {
	
	public Transacao[] transacoes;
	

	public Repositorio_Array_Transacao() {
		transacoes = new Transacao[50];
		for (int i = 0; i < Transacao.length; i++) {
			transacoes[i] = null;
		}
	}

	public void cadastrar (String cpf_comprador, String cpf_vendedor, String produto, int qntd,double preco)  {
		Transacao transac = new Transacao 
			(cpf_comprador,cpf_vendedor,produto,qntd,preco);
		inserir(transac);
	}

	public void inserir(Transacao Transacao) {
		for (int i = 0; i < transacoes.length; i++) {
			if (transacoes[i] == null) {
				transacoes[i] = Transacao;
				return;
			}
		}
	}

	public void Remover(String CPF) throws TransacaoNaoEncontrada_Exception {
		for (int i = 0; i < transacoes.length; i++) {
			if (transacoes[i] != null) {
				if (transacoes[i].get_CPFComprador() == CPF | transacoes[i].get_CPFVendedor() == CPF) {
					transacoes[i] = null;
					return;
				}
			}
		}
		TransacaoNaoEncontrada_Exception excecao;
		excecao= new TransacaoNaoEncontrada_Exception(CPF);
		throw excecao;
	}

	public Transacao procurar(String CPF) throws TransacaoNaoEncontrada_Exception {
		for (int i = 0; i < transacoes.length; i++) {
			Transacao transacao = transacoes[i];
			if (transacao.get_CPFComprador() == CPF | transacao.get_CPFVendedor() == CPF) {
				return transacao;
			}
		}
		TransacaoNaoEncontrada_Exception excecao;
		excecao= new TransacaoNaoEncontrada_Exception(CPF);
		throw excecao;
	}
	
	 public boolean existe (String CPF) {
	    	Transacao trans = null;
	    	try
	    	{trans = procurar (CPF); }
	    	catch (TransacaoNaoEncontrada_Exception e) {}
	    		if(trans !=null) {
	    			return true;
	    		}else {
	    			return false;
	    		}
	    		}
	    		

	public String ToString() {
		String retorno = "";
		for (int i = 0; i < transacoes.length; i++) {
			Transacao transacao = transacoes[i];
			if (transacao != null) {
	            retorno += "\nCPF Comprador: " + transacao.get_CPFComprador() +
	            		" - CPF Vendedor" 	 + transacao.get_CPFVendedor() +
	            		"   Preco :" +transacao.get_preco() +
	                   "    produto : " +transacao.get_produto()+
	                   "    quantidade : " +transacao.get_quantidade();
			}
		}
		return retorno;
	}

}
