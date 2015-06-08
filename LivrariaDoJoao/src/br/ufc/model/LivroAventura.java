package br.ufc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LivroAventura extends Livro{
	private long id;
	@NotNull
	@Size(min = 5)
	private String nome;
	@NotNull
	private double valor;
	@NotNull
	private int qtdEstoque;

	private boolean ilustracacoes;
	
	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	/*
	 * public List<categoria> categorias() { List<categoria> result = new
	 * ArrayList<categoria>(); result.add("aventura"); result.add("comedia");
	 * result.add("drama"); return result; }
	 */

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public LivroAventura() {

	}

	public LivroAventura(long id, String nome, double valor, int qtdEstoque) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.qtdEstoque = qtdEstoque;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {

		this.qtdEstoque = qtdEstoque;

	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", valor=" + valor
				+ ", qtdEstoque=" + qtdEstoque + "]";
	}

}
