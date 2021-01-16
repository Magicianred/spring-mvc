package com.montanhajr.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/todos")
	@ResponseBody
	public List<Usuario> todos() {
		
		return _usuarioRepository.findAll();
	}
	
	@RequestMapping("/excluir/{id}")
	@ResponseBody
	public String excluir(@ModelAttribute("id") Usuario usuario) {
		_usuarioRepository.delete(usuario);
		return "200";
	}
}
