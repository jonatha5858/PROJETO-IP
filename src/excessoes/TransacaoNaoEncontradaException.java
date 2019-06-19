package excessoes;

public class TransacaoNaoEncontradaException extends Exception {
	private String CPF;
	private String nome;


    //Erro caso tente interagir com uma transacao que nao existe.
	public TransacaoNaoEncontradaException (String CPF) {
		super(" transacao nao encontrada.");
	    this.nome = nome;
	    this.CPF = CPF;
	}
	
	public String getCPF() {
		return CPF;
		}

    public String getNome() {
        return nome;
    	
    
}
	}
	


