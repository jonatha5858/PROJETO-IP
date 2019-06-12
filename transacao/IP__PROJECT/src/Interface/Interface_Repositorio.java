package Interface;

import Exception.TransacaoNaoEncontrada_Exception;
import Transacao.Transacao;

public interface Interface_Repositorio {
		public void inserir (Transacao transacao);
        public void cadastrar (String cpf_comprador, String cpf_vendedor, String produto, int qntd,double preco) throws TransacaoNaoEncontrada_Exception;
		public void remover (String CPF) throws TransacaoNaoEncontrada_Exception;
		public Transacao procurar (String nome) throws TransacaoNaoEncontrada_Exception;
        public boolean existe (String nome);
	}

