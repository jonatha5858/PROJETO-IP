package compradores;

public class CadastroCompradores implements RepositorioCompradoresInterface {
	private RepositorioCompradoresLista repLista;
	private RepositorioCompradoresArray repArray;

	public CadastroCompradores() {
		this.repLista = null;
	}

	public void cadastrar(Comprador comprador) throws CompradorJaCadastradoException {
		if (!repLista.existe(comprador)) {
			repLista.inserir(comprador);
		} else
			throw new CompradorJaCadastradoException();
	}

	public void remover(Comprador comprador) throws CompradorNaoEncontradoException {
		if (repLista.existe(comprador)) {
			repLista.remover(comprador);
		} else
			throw new CompradorNaoEncontradoException();
	}

	public boolean existe(Comprador comprador) {
		return repLista.existe(comprador);
	}

	public void inserir(Comprador comprador) {
	}

	public Comprador procurar(String cpf) throws CompradorNaoEncontradoException {
		return repLista.procurar(cpf);
	}

	public void atualizar(Comprador comprador) throws CompradorNaoEncontradoException {
		this.repLista.atualizar(comprador);
	}
}
