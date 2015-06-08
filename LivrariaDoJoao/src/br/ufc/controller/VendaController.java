package br.ufc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.ufc.dao.FabricaDeConexoes;
import br.ufc.dao.LivroDAO;
import br.ufc.dao.VendasDAO;
import br.ufc.model.Livro;
import br.ufc.model.Vendas;

@Controller
public class VendaController {
	
	@RequestMapping("processaVendaLivro")
	public String processaVendaLivro(@RequestParam("id") long id, Livro livro,
			Model model) {
		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		
		System.out.println("ID-- " + id);
		VendasDAO vDAO = new VendasDAO(conn);
		Vendas v = new Vendas();
		LivroDAO uDAO = new LivroDAO(conn);
		
		livro = uDAO.getLivro(id);
		v.setId(livro.getId());
		v.setValor(livro.getValor());
		
		// quando chama dá erro: No operations allowed after connection closed.Mas da certo internamente
		vDAO.inserir(v); // GAMBIS, DEIXEI A CONEXAO ABERTA
		LivroDAO uDAO2 = new LivroDAO(conn);
		
		uDAO2.reduzirEstoque(id);
		
		return "venda_adicionado";
	}

	@RequestMapping("vendaLivro")
	public String vendaLivro(Livro livro,
			Model model) {

		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO uDAO = new LivroDAO(conn);
		VendasDAO vDAO = new VendasDAO(conn);

		List<Livro> livros;
		livros = uDAO.getListar();

		List<Vendas> vendas = vDAO.getListar();

		model.addAttribute("livros", livros);
		model.addAttribute("tamanho", vendas.size());

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "venda_livros";
	}
}
