
package com.cibertec.T2exa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.T2exa.model.Pelicula;
import com.cibertec.T2exa.repository.PeliculaRepository;

@Service
public class PeliculaServiceImplement implements PeliculaService {

    @Autowired
    private PeliculaRepository repository;

    @Override
    public List<Pelicula> listar() {
        return repository.findAll();
    }

    @Override
    public Pelicula buscarPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void guardar(Pelicula pelicula) {
        repository.save(pelicula);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
