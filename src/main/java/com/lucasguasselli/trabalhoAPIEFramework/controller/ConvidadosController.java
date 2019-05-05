package com.lucasguasselli.trabalhoAPIEFramework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucasguasselli.trabalhoAPIEFramework.dao.ConvidadoDAO;
import com.lucasguasselli.trabalhoAPIEFramework.domain.Convidado;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadoDAO convidadosDAO;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidadosDAO.findAll());
		modelAndView.addObject(new Convidado());
			return modelAndView;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		this.convidadosDAO.save(convidado);
		return "redirect:/convidados";
	}
}
