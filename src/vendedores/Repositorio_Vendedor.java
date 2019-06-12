package RepositorioVendedor;

import Contas.*;
import usuarios.*;
import Interface.*;

public abstract class Repositorio_Vendedor implements Interface_Repositorio_Vendedor {
	
	public abstract void Cadastrar(String nome, String cpf) throws Excecoes.CPFJaCadastrado;
	public abstract void Cadastrar(String nome, String cpf, double dinheiro) throws Excecoes.CPFJaCadastrado;
	
	public abstract void Adicionar(Vendedor vendedor);

	public abstract void Remover(String CPF) throws Excecoes.VendedorNaoEncontrado;
	
	public abstract Vendedor Procurar(String CPF) throws Excecoes.VendedorNaoEncontrado;
	
	public abstract boolean Existe(String CPF);
	
	public abstract String ToString();
	
}
