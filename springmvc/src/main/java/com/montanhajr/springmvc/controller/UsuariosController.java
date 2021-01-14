package com.montanhajr.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.montanhajr.springmvc.model.Usuario;
import com.montanhajr.springmvc.repository.IUsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private IUsuarioRepository _usuarioRepository;
	
	@RequestMapping
	public ModelAndView tela() {
		return new ModelAndView("usuarios");
	}
	
	@RequestMapping("/teste")
	public Usuario teste() {
		Usuario usuario = _usuarioRepository.findByNomeAndEmailContaining("roi", "roi");
		_usuarioRepository.buscarNomeCompleto();
		
		return usuario;
	}
}
