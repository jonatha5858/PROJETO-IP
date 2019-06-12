package compradores;

public class DinheiroInsuficienteException extends Exception {
	public DinheiroInsuficienteException(Produto produto) {
		System.out.println("Não há dinheiro suficiente para realizar a transação do produto " + produto.getNome());
	}
	

}
