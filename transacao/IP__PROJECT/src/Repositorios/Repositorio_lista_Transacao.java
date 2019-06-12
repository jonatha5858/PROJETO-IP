package Repositorios;
import java.net.InterfaceAddress;

import Exception.TransacaoNaoEncontrada_Exception;
import Interface.Interface_Repositorio;
import Transacao.Transacao;

public class Repositorio_lista_Transacao implements Interface_Repositorio{
	    private Transacao primeiro, ultimo;
	    private int length;
	    
	    public Repositorio_lista_Transacao() {
	        primeiro = new Transacao(null, null, null, 0, 0);
	        // VARIAVEL ARBITRARIA
	        primeiro.setNext(null);
	        ultimo = primeiro;
	        length = 0;
	    }
	    public void cadastrar (String cpf_comprador, String cpf_vendedor, String produto, int qntd,double preco)  {
			Transacao transac = new Transacao 
				(cpf_comprador,cpf_vendedor,produto,qntd,preco);
			inserir(transac);
		}
	    
	    public void inserir(Transacao transacao) {
	        ultimo.setNext(transacao);
	        ultimo = transacao;
	        length++;
	    }
	    
	    public void remover(String CPF) throws TransacaoNaoEncontrada_Exception {
	        Transacao transacao = primeiro;
	        while(transacao.getNext() != null) {
	            if(transacao.get_CPFComprador() == CPF | transacao.get_CPFVendedor() == CPF) {
	                transacao.setNext(transacao.getNext().getNext());
	                return;
	            }
	            
	            transacao = transacao.getNext();
	        }
	        
	        TransacaoNaoEncontrada_Exception excecao;
			excecao= new TransacaoNaoEncontrada_Exception(CPF);
			throw excecao; 
	    }
	    
	    
	    public Transacao procurar(String CPF) throws TransacaoNaoEncontrada_Exception {
	        Transacao transacao = primeiro;
	        while(transacao.getNext() != null) {
	            transacao = transacao.getNext();
	            
	            if(transacao.get_CPFComprador() == CPF | transacao.get_CPFVendedor() == CPF) {
	               return transacao;
	            }
	        }
	        
	        TransacaoNaoEncontrada_Exception excecao;
			excecao= new TransacaoNaoEncontrada_Exception(CPF);
			throw excecao; 
	    }
	    
	    public boolean existe (String CPF) {
	    	Transacao trans = null;
	    	try
	    	{trans = procurar (CPF); }
	    	catch (TransacaoNaoEncontrada_Exception e) {}
	    		if(trans !=null) {
	    			return true;
	    		}else {
	    			return false;
	    		}
	    		}
	    		
	    	
	    
	    
	    public String ToString() {
	    	System.out.println(length);
	    	
	        String retorno = "";
	        Transacao transacao = primeiro.getNext();
	        while(transacao != null) {
	            retorno += "\nCPF Comprador: " + transacao.get_CPFComprador() +
	            		" - CPF Vendedor" 	 + transacao.get_CPFVendedor() +
	            		"   Preco :" +transacao.get_preco() +
	                   "    produto : " +transacao.get_produto()+
	                   "    quantidade : " +transacao.get_quantidade();
	            transacao = transacao.getNext();
	        }
	        return retorno;
	    }


	}

