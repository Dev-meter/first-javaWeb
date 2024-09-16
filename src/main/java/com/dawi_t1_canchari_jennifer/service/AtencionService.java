package com.dawi_t1_canchari_jennifer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dawi_t1_canchari_jennifer.model.Atencion;
import com.dawi_t1_canchari_jennifer.model.Tipo;
import com.dawi_t1_canchari_jennifer.repository.IAtencionRepository;
import com.dawi_t1_canchari_jennifer.repository.ITipoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AtencionService {
	
	private final ITipoRepository repoTipo;
	private final IAtencionRepository repoAten;
	
	public List<Tipo> listaTipos() {
	return repoTipo.findAll();
		}
	
	public List<Atencion> listaAtenciones() {
	return repoAten.findAll();
	}

	public Atencion grabarAtencion(Atencion a) {
		return repoAten.save(a);
	}
	
	public Atencion obtenerAtencion(int num_atencion) {
		 return repoAten.findById(num_atencion).orElse(null);
	}
	
	/*
	public List<Atencion> buscarPaciente(int cod_tipo_atencion){
		return repoAten.findByTipoAtencion_CodTipoAtencion(cod_tipo_atencion);
	}*/


}











