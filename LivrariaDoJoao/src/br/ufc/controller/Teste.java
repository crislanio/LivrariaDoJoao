package br.ufc.controller;

import br.ufc.model.Livro;
import br.ufc.model.Vendas;

public class Teste {

	public static void main(String[] args) {
		Livro l = new Livro();
		Vendas v = new Vendas();

		l.setQtdEstoque(3);
		l.setQtdEstoque(5);
		
		int venda = l.getQtdEstoque();
	
	}

}
