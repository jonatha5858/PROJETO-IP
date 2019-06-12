package Exception;

public class TransacaoNaoEncontrada_Exception extends Exception {
	private String CPF;
	
	public TransacaoNaoEncontrada_Exception (String CPF) {
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	//public TransacaoNaoEncontrada_Exception ()
}

