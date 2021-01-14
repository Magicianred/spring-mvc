package com.montanhajr.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.montanhajr.springmvc.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByNomeAndEmailContaining(String nome, String email);
	
	@Query("SELECT u FROM Usuario u WHERE u.nome = 'roi'")
	public Usuario buscarNomeCompleto();
}
