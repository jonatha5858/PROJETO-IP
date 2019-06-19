package compradores;

//Autor: Carlos

public class RepositorioCompradoresLista implements RepositorioCompradoresInterface {
	private Comprador comprador;
	private RepositorioCompradoresLista proximo;

	public RepositorioCompradoresLista() {
		this.comprador = null;
		this.proximo = null;
	}
	//Inserir irá inserir os compradores na lista de Comprador. Não lança exceção, pois nele é possível ter vários compradores iguais.
	public void inserir(Comprador comprador) {
		if (this.proximo != null) {
			this.comprador = comprador;
			this.proximo = new RepositorioCompradoresLista();
		} else {
			this.proximo.inserir(comprador);
		}
	}
	//Remover irá substituir o comprador pelo seu proximo, removendo o comprador desejado e movendo todos os outros uma posição abaixo na lista.
	public void remover(Comprador comprador) throws CompradorNaoEncontradoException {
		if (this.proximo != null) {
			if (this.comprador.getCPF().equals(comprador.getCPF())) {
				this.comprador = this.proximo.comprador;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(comprador);
			}
		} else {
			throw new CompradorNaoEncontradoException();
		}
	}
	//Metodo existe retorna um boolean que apenas confirma a existencia ou nao do comprador procurado no repositorio, por isso não lança exceção.
	public boolean existe(Comprador comprador) {
		if (this.proximo != null) {
			if (this.comprador.getCPF().equals(comprador.getCPF())) {
				return true;
			} else {
				return this.proximo.existe(comprador);
			}
		} else {
			return false;
		}
	}
	//Metodo procurar retorna um Comprador, aquele que foi procurado.
	public Comprador procurar(String cpf) throws CompradorNaoEncontradoException {
		if (this.proximo != null) {
			if (this.comprador.getCPF().equals(cpf)) {
				return this.comprador;
			} else {
				return this.proximo.procurar(cpf);
			}
		} else {
			throw new CompradorNaoEncontradoException();
		}
	}
	//Atualizar altera os atributos de um determinado Comprador da lista, recebendo assim um novo comprador.
	public void atualizar(Comprador comprador) throws CompradorNaoEncontradoException{
		if (this.proximo != null) {
			if (this.comprador.getCPF().equals(comprador.getCPF())) {
				this.comprador = comprador;
			} else {
				this.proximo.atualizar(comprador);
			}
		} else {
			throw new CompradorNaoEncontradoException();
		}
	}
}
