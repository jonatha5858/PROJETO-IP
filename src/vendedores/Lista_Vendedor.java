package RepositorioVendedor;

import usuarios.*;
import Contas.*;
import Contas.Usuario.*;
import Excecoes.*;

public class Lista_Vendedor extends Repositorio_Vendedor {
	private Vendedor primeiro, ultimo;
	
	public Lista_Vendedor() {
		primeiro = new Vendedor(null, null, null, 0);
		// VARIAVEL ARBITRARIA
		primeiro.setNext(null);
		ultimo = primeiro;
	}
	
	public void Adicionar(Vendedor vendedor) {
		
		ultimo.setNext(vendedor);
		ultimo = vendedor;
	}
	
	public void Remover(String CPF) throws Excecoes.VendedorNaoEncontrado {
		Usuario user = primeiro;
		
		while(user.getNext() != null) {
			if(user.getNext().getCPF() == CPF) {
				user.setNext(user.getNext().getNext());
				return;
			}
			user = user.getNext();
		}
		
		throw new Excecoes.VendedorNaoEncontrado(CPF); 
	}

	public Vendedor Procurar(String CPF) throws Excecoes.VendedorNaoEncontrado {
		Vendedor vendedor = primeiro;
		while(vendedor.getNext() != null) {
			vendedor = vendedor.getNext();
			
			if(vendedor.getCPF() == CPF) {
				return vendedor;
			}
		}
		
		 throw new Excecoes.VendedorNaoEncontrado(CPF); 
	}

	public boolean Existe(String CPF) {
		Usuario user = null;
		
		try
		{	user = Procurar(CPF);	}
		catch(Excecoes.VendedorNaoEncontrado e)
		{	}
		
		if(user != null) {
			return true;
		} else {
			return false;
		}
	}

	public String ToString() {
		String retorno = "";
		Vendedor user = primeiro.getNext();
		while(user != null) {
			//retorno += user.getNome() + " - " + user.getCPF() + "\n";
			retorno +=  user.toString() + "\n";
			
			
			user = user.getNext();
		}
		return retorno;
	}

	public void Cadastrar(String nome, String CPF, Estado estado) throws CPFJaCadastrado {
		if(Existe(CPF)) {
			throw new CPFJaCadastrado(CPF);
		} else {
			Vendedor vendedor = new Vendedor(nome, CPF, estado, 0);
			Adicionar(vendedor);
		}
	}

	public void Cadastrar(String nome, String CPF, Estado estado, double dinheiro) throws CPFJaCadastrado {
		if(Existe(CPF)) {
			throw new CPFJaCadastrado(CPF);
		} else {
			Vendedor vendedor = new Vendedor(nome, CPF, estado, dinheiro);
			Adicionar(vendedor);
		}
	}
	
}
