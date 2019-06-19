package compradores;

//Autor: Carlos

//Excecao para caso o Comprador procurado não seja encontrado no repositório.
public class CompradorNaoEncontradoException extends Exception {
	public CompradorNaoEncontradoException() {
		super("Esse comprador não foi encontrado.");
	}
}
