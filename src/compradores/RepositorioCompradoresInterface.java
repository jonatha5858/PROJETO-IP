package compradores;

//Interface para ser implementada nos repositórios Array e Lista.
public interface RepositorioCompradoresInterface {
	void inserir(Comprador comprador);

	void remover(Comprador comprador) throws CompradorNaoEncontradoException;

	Comprador procurar(String cpf)  throws CompradorNaoEncontradoException;

	void atualizar(Comprador comprador) throws CompradorNaoEncontradoException;

	boolean existe(Comprador comprador);
}
