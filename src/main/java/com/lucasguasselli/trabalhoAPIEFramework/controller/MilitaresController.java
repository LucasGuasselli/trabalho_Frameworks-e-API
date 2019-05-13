package com.lucasguasselli.trabalhoAPIEFramework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucasguasselli.trabalhoAPIEFramework.dao.MilitarDAO;
import com.lucasguasselli.trabalhoAPIEFramework.domain.Convidado;
import com.lucasguasselli.trabalhoAPIEFramework.domain.Militar;

@Controller
public class MilitaresController {

	@Autowired
	private MilitarDAO militaresDAO;
	
	@GetMapping("/aa")
	public ModelAndView carregarViewInicial() {
		ModelAndView modelAndView = new ModelAndView("index");
		 modelAndView.addObject("militares", militaresDAO.findAll());
		 modelAndView.addObject(new Militar());
			return modelAndView;
	}
	
	@PostMapping("/aa")
	public String direcionar() {
		return "redirect:/militares";
	}
	
	@GetMapping("/militares")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaMilitares");
		modelAndView.addObject("militares", militaresDAO.findAll());
		modelAndView.addObject(new Militar());
			return modelAndView;
	}
	
	@PostMapping("/militares")
	public String salvar(Militar militar) {
		this.militaresDAO.save(militar);
		return "redirect:/militares";
	}
}
