package com.rodrigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rodrigo.model.Pessoa;
import com.rodrigo.repository.Pessoas;

@Controller
@RequestMapping("/pessoas")
public class CadastroController {

	@Autowired
	private Pessoas pessoas;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mav = new ModelAndView("CadastroPessoa");

		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Pessoa pessoa) {
		pessoas.save(pessoa);

		System.out.println(pessoa.getNome());
		ModelAndView mav = new ModelAndView("CadastroPessoa");
		mav.addObject("mensagem", "Pessoa salva com sucesso!");

		return mav;
	}
	
}
