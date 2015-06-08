package br.ufc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.ufc.model.Vendas;

public class VendasDAO {
	private Connection conn;

	public VendasDAO(Connection conn) {
		this.conn = conn;
	}

	public void inserir(Vendas venda) {

		// contruindo o SQL de inserção
		String sql = "INSERT INTO venda " + "(id,valor)" + "values (?,?)";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1, venda.getId());
			stmt.setDouble(2, venda.getValor());

			stmt.execute();
		// deixando aberta para que depois possa chamar reduzirEstoque possa ta aberta
			//	stmt.close();
		//	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int contVendas() {
		String sql = "SELECT count(*) FROM venda";
		int count=0;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				count = rs.getInt(1);
			}
		//	rs.close();
		//	stmt.close();
		//	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	public double contLucro() {
		String sql = "SELECT sum(valor) FROM venda";
		double total=0.0;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				double soma = rs.getInt(1);
				total +=soma;
			}
		// somente aparece as vendas e o lucro se as conexões estão abertas
			
		//	rs.close();
		//	stmt.close();
		//	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}

	public ArrayList<Vendas> getListar() {
		ArrayList<Vendas> vendas = new ArrayList<Vendas>();

		String sql = "SELECT id,valor FROM venda";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Vendas u = new Vendas();
				u.setId(rs.getInt(1));
				u.setValor(rs.getDouble(2));
				vendas.add(u);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vendas;
	}

}
