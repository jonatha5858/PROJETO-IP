package Interface;

import Contas.*;

public interface Interface_Repositorio_Vendedor {
	public void Adicionar(Vendedor vendedor) throws Excecoes.CPFJaCadastrado;
	public void Remover(String CPF) throws Excecoes.VendedorNaoEncontrado;
	public Vendedor Procurar(String CPF) throws Excecoes.VendedorNaoEncontrado;
	public boolean Existe(String CPF);
	public String ToString();
	
}
