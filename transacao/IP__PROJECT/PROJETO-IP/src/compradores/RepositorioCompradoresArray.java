package compradores;

public class RepositorioCompradoresArray implements RepositorioCompradoresInterface {
	private Comprador[] compradores;
	private int indice;

	public RepositorioCompradoresArray() {
		this.compradores = new Comprador[200];
		this.indice = 0;
	}
	//Metodo existe retorna um boolean que  apenas confirma a existencia ou nao do comprador procurado no repositorio, por isso n�o lan�a exce��o.
	public boolean existe(Comprador comprador) {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i] != null) {
				if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
					return true;
				}
			}
		}
		return false;
	}
	//Inserir ir� inserir os compradores no array de Comprador. N�o lan�a exce��o, pois nele � poss�vel ter v�rios compradores iguais.
	public void inserir(Comprador comprador) {
		if (indice < 199) {
			if (compradores[indice] == null) {
				compradores[indice] = comprador;
			} else {
				indice++;
				this.inserir(comprador);
			}
		} // else{
			// Comprador[] compradores2 = new Comprador[300];
			// for (int k = 0; k < 200; k++) {
			// compradores2[k] = compradores[k];
			// }
			// compradores= compradores2;
			// }
	}
	//Remover ir� retirar o comprador do array, ao substituir com null e mover todos ap�s else uma posi��o abaixo. 
	public void remover(Comprador comprador) throws CompradorNaoEncontradoException {
		for (int i = 0; i < 198; i++) {
			if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
				for (int n = 0; n < indice; n++) {
					compradores[n] = compradores[n + 1];
					compradores[n + 1] = null;
				}
			}
		}
		throw new CompradorNaoEncontradoException();
	}
	//Metodo procurar retorna um Comprador, aquele que foi procurado.
	public Comprador procurar(String cpf) throws CompradorNaoEncontradoException {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i].getCPF().equals(cpf)) {
				return compradores[i];
			}
		}
		throw new CompradorNaoEncontradoException();
	}
	//Atualizar altera os atributos de um determinado Comprador do array, recebendo assim um novo comprador.
	public void atualizar(Comprador comprador) throws CompradorNaoEncontradoException {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
				this.compradores[i] = comprador;
			}
		}
		throw new CompradorNaoEncontradoException();
	}
}
