package compradores;

//Classe Produto auxiliar para que o código compile.
public class Produto {
	private double preco;
	private String nome;
	private String cpfVendedor;
	public Produto (String cpfVendedor, String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
		this.cpfVendedor = cpfVendedor;
	}
	public double getPreco () {
		return this.preco;
	} 
	public String getNome () {
		return this.nome;
	}
	public String getCPFVendedor () {
		return this.cpfVendedor;
	}
	public void setPreco (double preco) {
		this.preco = preco;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setCPFVendedor (String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}
}
