package br.ufc.model;

import java.util.List;

import javax.validation.constraints.NotNull;


public class Vendas {
	@NotNull
	private long id;
	List <Livro> listaLivros;
	
	private double valor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
