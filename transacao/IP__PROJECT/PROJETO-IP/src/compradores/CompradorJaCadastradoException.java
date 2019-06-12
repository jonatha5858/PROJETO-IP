package compradores;

public class CompradorJaCadastradoException extends Exception {
	public CompradorJaCadastradoException() {
		super("Esse comprador já está cadastrado.");
	}

}
