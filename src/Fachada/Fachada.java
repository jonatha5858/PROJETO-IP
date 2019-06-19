package Fachada;
import Transacao.RepositorioTransacaoArray;
import Transacao.RepositorioTransacaoLista;
import Transacao.Transacao;
import excessoes.TransacaoNaoEncontradaException;
public class Fachada {

	public static void main(String[] args) {

		//RepositorioTransacaoLista lista = new RepositorioTransacaoLista();
		RepositorioTransacaoArray lista = new RepositorioTransacaoArray();
		
		
		lista.inserir(new Transacao("1213", "0788", "nome", 9,2));
		lista.inserir(new Transacao("0000", "1111", "nome", 9,2));
		lista.inserir(new Transacao("2222", "3333", "nome", 9,2));
		//lista.cadastrar("70555","0000999","nome",7,2);
		//lista.cadastrar("70555","0000999","nome",7,2);
		//lista.cadastrar("70555","0000999","nome",7,2);
		lista.existe("String CPF");
		lista.existe("String CPF");
		lista.existe("String CPF");
		
		try {
			lista.procurar("1213");
			System.out.println("Cpf encontrado.");
		} catch (TransacaoNaoEncontradaException e) {
			System.out.println("CPF nº " + e.getCPF() +" não encontrado");
		}
		System.out.println(lista.ToString());
	}

}
