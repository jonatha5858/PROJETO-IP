package compradores;

//Autor: Carlos

//Excecao para caso o Comprador procurado n�o seja encontrado no reposit�rio.
public class CompradorNaoEncontradoException extends Exception {
	public CompradorNaoEncontradoException() {
		super("Esse comprador n�o foi encontrado.");
	}
}
