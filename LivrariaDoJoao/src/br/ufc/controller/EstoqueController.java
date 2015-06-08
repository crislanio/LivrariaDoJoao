package br.ufc.controller;

import java.sql.Connection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.FabricaDeConexoes;
import br.ufc.dao.VendasDAO;
import br.ufc.model.Livro;

@Controller
public class EstoqueController {

	
	@RequestMapping("infoEstoque")
	public String infoVenda(Livro livro, Model model) {
		FabricaDeConexoes fc = new FabricaDeConexoes();
		Connection conn = fc.getConexao();
		VendasDAO vDAO = new VendasDAO(conn);

		double lucro= vDAO.contLucro();  // só executa quem estiver 1°
		model.addAttribute("lucro", lucro);
		
		int vendas = vDAO.contVendas();
		model.addAttribute("vendas", vendas);

		
		System.out.println("n vendas > "+vendas);
		System.out.println("lucro > "+lucro);
		

		return "informacao_estoque";
	}
}
