package Transacao;

import excessoes.TransacaoNaoEncontradaException;

  public interface RepositorioTransacao {
				public void inserir (Transacao transacao);
		        public void cadastrar (String CpfComprador, String CpfVendedor, String Produto, int quantidade,double preco) throws TransacaoNaoEncontradaException;
				public void remover (String CPF) throws TransacaoNaoEncontradaException;
				public Transacao procurar (String nome) throws TransacaoNaoEncontradaException;           
				public boolean existe(String nome);
				public void atualizar(Transacao transacao)throws TransacaoNaoEncontradaException;
			}
  
  

