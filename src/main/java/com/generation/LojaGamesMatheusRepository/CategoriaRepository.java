package com.generation.LojaGamesMatheusRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaGamesMatheusModel.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByPlataformaContainingIgnoreCase(String plataforma);
}