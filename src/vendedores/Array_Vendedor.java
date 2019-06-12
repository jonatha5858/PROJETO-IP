package RepositorioVendedor;

import Contas.*;
import Contas.Usuario.*;
import Excecoes.*;

public class Array_Vendedor extends Repositorio_Vendedor{
	private Vendedor [] vendedores;
	
	public Array_Vendedor(){
		vendedores = new Vendedor [20];
		for(int i = 0; i < vendedores.length; i++) {
			vendedores[i] = null;
		}
	}
	
	public void Adicionar (Vendedor vendedor) {
		
		for(int i = 0; i < vendedores.length; i++) {
			if(vendedores[i] == null) {
				vendedores[i] = vendedor;
				return;
			}
		}
	}
	
	public void Remover (String CPF) throws Excecoes.VendedorNaoEncontrado {
		for(int i = 0; i < vendedores.length; i++) {
			if(vendedores[i] != null) {
				if(vendedores[i].getCPF() == CPF) {
					vendedores[i] = null;
					return;
				}
			}
		}
		
		throw new Excecoes.VendedorNaoEncontrado(CPF); 
	}

	public Vendedor Procurar (String CPF) throws Excecoes.VendedorNaoEncontrado {
		for(int i = 0; i < vendedores.length; i++) {
			Vendedor vendedor = vendedores[i];
			if(vendedor != null) {
				if(vendedor.getCPF() == CPF) {
					return vendedor;
				}
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
		for(int i = 0; i < vendedores.length; i++) {
			Usuario usuario = vendedores[i];
			if(usuario != null) {
				retorno += usuario.toString() + "\n";
			}
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
