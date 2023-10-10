package com.pharmexpressgroup.pharmexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pharmexpressgroup.pharmexpress.model.Produto;
import com.pharmexpressgroup.pharmexpress.model.ProdutoService;

@Controller
@RequestMapping("/pharmexpress/produto")
public class ProdutoController {
    @Autowired private ProdutoService service;
	
    @GetMapping("/produtos")
    public String showProdutos(Model model) {
        List<Produto> listProdutos = service.listAll();
        model.addAttribute("listaDeProdutos", listProdutos);

        return "produtos";
    }

	@GetMapping("/novo-produto")
	public String novoProduto() {
		
		return "novo-produto";
		
	}

}
