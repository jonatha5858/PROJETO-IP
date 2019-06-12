package Excecoes;

public class CPFJaCadastrado extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String CPF;
	   
	public CPFJaCadastrado(String CPF)
	{	this.CPF = CPF;		} 

	public String getCPF()
	{
		return CPF;
	}

}