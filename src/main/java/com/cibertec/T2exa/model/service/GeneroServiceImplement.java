package com.cibertec.T2exa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.T2exa.model.Genero;
import com.cibertec.T2exa.repository.GeneroRepositoy;
@Service
public class GeneroServiceImplement implements GeneroService  {
	@Autowired
    private GeneroRepositoy repository;

    @Override
    public List<Genero> listar() {
        return ((GeneroRepositoy) repository).findAll();
    }
}


