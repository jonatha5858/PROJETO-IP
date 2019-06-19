package compradores;

import Contas.Usuario;

//Autor: Carlos

//Classe Comprador, que herda de Usuario, será declarada para que possa ser implementada nos Repositórios.
//Comprador é uma classe básica.
public class Comprador extends Usuario {
	public Comprador(String nome, double dinheiro, String CPF, Estado estado) {
		this.setNome(nome);
		this.setDinheiro(dinheiro);
		this.setCPF(CPF);
		this.setEstado(estado);
	}

	public void transacao(Produto produto) throws DinheiroInsuficienteException {
	}

	@Override
	public void Transacao(Produto produto)  {
		// TODO Auto-generated method stub
	}

	@Override
	public void Transacao(String nome_produto, double preco, int quantidade) {
		// TODO Auto-generated method stub
		produtos.procurar(nome_produto);
		setDinheiro(this.getDinheiro() - preco);
		quantidade = quantidade - 1;
		System.out.println("remover do repositorio de produtos o produto comprado (fachada/main)!" );
	}
}
