package compradores;

public class DinheiroInsuficienteException extends Exception {
	public DinheiroInsuficienteException(Produto produto) {
		System.out.println("N�o h� dinheiro suficiente para realizar a transa��o do produto " + produto.getNome());
	}
	

}
