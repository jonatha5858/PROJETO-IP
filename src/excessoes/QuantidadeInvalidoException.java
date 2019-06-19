package excessoes;

public class QuantidadeInvalidoException extends Exception {
	    //Erro caso tente inserir uma quantidade negativa ou zero.
	    public QuantidadeInvalidoException() {
	        super ("invalido.");

	    }
	}

