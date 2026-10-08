package com.cibertec.T2exa.model.service;

import java.util.List;

import com.cibertec.T2exa.model.Pelicula;

public interface PeliculaService {
	 List<Pelicula> listar();

	    Pelicula buscarPorId(Integer id);

	    void guardar(Pelicula pelicula);

	    void eliminar(Integer id);
}
