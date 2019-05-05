package com.lucasguasselli.trabalhoAPIEFramework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucasguasselli.trabalhoAPIEFramework.dao.ConvidadoDAO;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadoDAO convidadosDAO;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidadosDAO.findAll());
		
		return modelAndView;
	}
}
