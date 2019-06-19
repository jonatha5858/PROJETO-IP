package Transacao;

import excessoes.TransacaoJaCadastradoException;
import excessoes.TransacaoNaoEncontradaException;


public class CadastroTransacao {
	    private RepositorioTransacao repositorioTransacao;
	    public CadastroTransacao(RepositorioTransacao repositorioTransacao){
	        this.repositorioTransacao = repositorioTransacao;
	    }

	    //Cadastra nova transacao no repositorio e retorna uma excecao caso ele ja tenha sido cadastrado.
	    public void cadastrar (Transacao transacao)
	        throws TransacaoJaCadastradoException {
	        if(this.repositorioTransacao.existe(transacao.getNome())){
	            throw new TransacaoJaCadastradoException();
	        }else{
	            this.repositorioTransacao.inserir(transacao);
	        }
	    }

	    //Remove transacao do repositorio e retorna uma excecao caso ele nao esteja no repositorio.
	    public void remover(String nome)
	        throws TransacaoNaoEncontradaException{
	        this.repositorioTransacao.remover(nome);
	    }

	    //Atualiza transacao do repositorio e retorna uma excecao caso ele nao esteja no repositorio.
	    public void atualizar(Transacao transacao)
	        throws TransacaoNaoEncontradaException{
	        this.repositorioTransacao.atualizar(transacao);
	    }

	    //Procura transacao do repositorio e retorna uma excecao caso ele nao esteja no repositorio.
	    public Transacao procurar(String nome)
	        throws TransacaoNaoEncontradaException{
	        return this.repositorioTransacao.procurar(nome);
	    }

	    //Confirma se ha um transacao no repositorio.
	    public boolean existe(String nome){
	        return this.repositorioTransacao.existe(nome);
	    }
	}


