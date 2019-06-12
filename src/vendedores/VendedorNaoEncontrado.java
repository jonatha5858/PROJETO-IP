package Excecoes;

public class VendedorNaoEncontrado extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String CPF;
	   
	public VendedorNaoEncontrado(String CPF)
	{    this.CPF = CPF;   }
	
	public String getCPF()
	{     return CPF;	   }
	   
	   
}
