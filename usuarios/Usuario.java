package usuarios;

//Importar classes para que o código compile.
import compradores.DinheiroInsuficienteException;
import compradores.Produto;

public abstract class Usuario {
	private String nome;
	private String endereco;
	private double dinheiro;
	private String cpf;

	//Construtor da classe Usuario.
	public Usuario(String nome, String endereco, double dinheiro, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.dinheiro = dinheiro;
		this.cpf = cpf;
	}
	//Metodos get e set para obter e definir os atributos da classe.
	public String getNome() {
		return this.nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public double getDinheiro() {
		return this.dinheiro;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	//Metodo abstrato que será implementado nas subclasses concretas.
	public abstract void transacao (Produto produto) throws DinheiroInsuficienteException;
}
