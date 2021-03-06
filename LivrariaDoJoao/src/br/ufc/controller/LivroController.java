package br.ufc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.ufc.dao.FabricaDeConexoes;
import br.ufc.dao.LivroDAO;
import br.ufc.model.Livro;

@Controller
public class LivroController{

	@RequestMapping("formularioLivro")
	public String formularioLivro() {
		return "inserir_livro";
	}

	public String categoria(String categoria) {
		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO aDAO = new LivroDAO(conn);
		Livro livro = new Livro();

		String acao = new String();
		acao = "aventura";
		if (acao.equalsIgnoreCase("aventura")) {
			livro.setCategoria("aventura");
			livro.getCategoria();
			aDAO.inserir(livro);
		}

		if (acao.equalsIgnoreCase("drama")) {
			livro.setCategoria("drama");

			livro.getCategoria();
			aDAO.inserir(livro);
		}
		if (acao.equalsIgnoreCase("acao")) {
			livro.setCategoria("acao");

			livro.getCategoria();
			aDAO.inserir(livro);
		}
		return "livro_adicionado";
	}

	@RequestMapping("buscarPorCategoria")
	public String buscarPorCategoria(@RequestParam("categoria") String categoria, Livro livro, Model model) {
		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO aDAO = new LivroDAO(conn);
		

		List<Livro> livros = aDAO.buscar(categoria);
		
		model.addAttribute("livros", livros);
		

		return "buscar_livros";
	}

	@RequestMapping("adicionarLivro")
	public String adicionarLivro(@Valid Livro livro, BindingResult result) {

		if (result.hasErrors()) {
			return "inserir_livro";
		}

		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO aDAO = new LivroDAO(conn);

		aDAO.inserir(livro);

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "livro_adicionado";
	}

	@RequestMapping("listarLivro")
	public String listarLivro(Model model) {

		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO uDAO = new LivroDAO(conn);

		List<Livro> livros = uDAO.getListar();
		model.addAttribute("livros", livros);
		model.addAttribute("tamanho", livros.size());

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "listar_livros";
	}

	@RequestMapping("deletarLivro")
	public String removerLivro(Livro u) {

		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO uDAO = new LivroDAO(conn);

		uDAO.delete_livro(u);
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:listarLivro";
	}

	@RequestMapping("buscarLivro")
	public String buscarLivro(Model model) {

		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		LivroDAO uDAO = new LivroDAO(conn);

		List<Livro> livros = uDAO.getListar();
		model.addAttribute("livros", livros);
		model.addAttribute("tamanho", livros.size());

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "buscar_livros";
	}

}
