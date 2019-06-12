package compradores;
import usuarios.*;
import produtos.*;

//Classe Comprador, que herda de Usuario, ser� declarada para que possa ser implementada nos Reposit�rios.
//Comprador � uma classe b�sica.
public class Comprador extends Usuario {
	public Comprador(String nome, String endereco, double dinheiro, String cpf) {
		super(nome, endereco, dinheiro, cpf);
	}

	public void transacao(Produtos produto) throws DinheiroInsuficienteException {
		if (this.getDinheiro() >= produto.getPreco()) {
			setDinheiro(this.getDinheiro() - produto.getPreco());
			// remover do repositorio de produtos o produto comprado!
		} else {
			throw new DinheiroInsuficienteException(produto);
		}
	}
}
