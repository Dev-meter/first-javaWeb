package com.dawi_t1_canchari_jennifer.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dawi_t1_canchari_jennifer.model.Atencion;

@Repository
public interface IAtencionRepository extends JpaRepository <Atencion, Integer> {
	/*List<Atencion> findByTipoAtencion_CodTipoAtencion(int cod_tipo_atencion);*/
	
	}

