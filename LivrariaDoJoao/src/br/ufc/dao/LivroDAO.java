package br.ufc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;


import br.ufc.model.Livro;

public class LivroDAO {
	private Connection conn;

	public LivroDAO(Connection conn) {
		this.conn = conn;
	}

	public void inserir(Livro livro) {

		// contruindo o SQL de inserção
		String sql = "INSERT INTO livro "
				+ "(id,nome,valor,qtdEstoque, categoria)"
				+ "values (?,?,?,?,?)";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1, livro.getId());
			stmt.setString(2, livro.getNome());
			stmt.setDouble(3, livro.getValor());
			stmt.setInt(4, livro.getQtdEstoque());
			stmt.setString(5, livro.getCategoria());

			stmt.execute();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete_livro(Livro livro) {

		String sql = "delete from livro where id = ?";

		try {

			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setLong(1, livro.getId());
			stm.executeUpdate();

			stm.close();

			System.out.println("Deletado com Sucesso!!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<Livro> getListar() {
		ArrayList<Livro> livros = new ArrayList<Livro>();

		String sql = "SELECT id,nome,categoria, valor,qtdEstoque FROM livro";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Livro u = new Livro();
				u.setId(rs.getInt(1));
				u.setNome(rs.getString(2));
				u.setCategoria(rs.getString(3));
				u.setValor(rs.getDouble(4));
				u.setQtdEstoque(rs.getInt(5));
				livros.add(u);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return livros;
	}

	public Vector<Livro> buscar(String categoria) {
		Vector<Livro> resultados = new Vector<Livro>();
		String sql = ("SELECT * FROM livro WHERE categoria LIKE '" + categoria + "%';");
		ResultSet rs;
		try {
			PreparedStatement comando = conn.prepareStatement(sql);

			rs = comando.executeQuery();

			while (rs.next()) {
				Livro temp = new Livro();
				// pega todos os atributos do livro
				temp.setId(rs.getLong("id"));
				temp.setNome(rs.getString("nome"));
				temp.setValor(rs.getDouble("valor"));
				temp.setQtdEstoque(rs.getInt("qtdEstoque"));
				temp.setCategoria(rs.getString("categoria"));
				resultados.add(temp);
			}
			rs.close();
			comando.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultados;
	}
}
