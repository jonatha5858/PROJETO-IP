package compradores;

//Autor: Carlos

public class CompradorJaCadastradoException extends Exception {
	public CompradorJaCadastradoException() {
		super("Esse comprador j� est� cadastrado.");
	}

}
