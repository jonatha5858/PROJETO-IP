package usuarios;
import produtos.*;

public abstract class Usuario {
	
	private Usuario next = null;
	private String nome;
	private double dinheiro;
	private String CPF;
	
	
	public abstract void Operar (Produtos produto);
	
	public abstract void Operar (String nome_produto, double preco, int quantidade);
	
	
	public String toString () {
		//return null;
		return "Nome: " + nome + getSpace(10 - nome.length()) +
				"-  CPF: " + CPF + getSpace(7 - CPF.length()) +
				"  -  Dinheiro: " + dinheiro + getSpace(9 - Double.toString(dinheiro).toString().length());
	}
	
	private String getSpace(int param) {
		String retorno = "";
		for(int i = 1; i < param; i++) {
			retorno += " ";
		}
		return retorno;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return CPF;
	}
	
	
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	
	public void setNext(Usuario usuario) {
		next = usuario;
	}
	public Usuario getNext() {
		return next;
	}

}
