package excessoes;

public class TransacaoJaCadastradoException extends Exception {
	   private String nome;

	    //Erro caso tente ser inserido uma transacao que ja existe.
	    public TransacaoJaCadastradoException (){
	        super (" ja cadastrado.");
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	}


