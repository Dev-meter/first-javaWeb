package com.dawi_t1_canchari_jennifer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dawi_t1_canchari_jennifer.model.Tipo;


@Repository
public interface ITipoRepository extends JpaRepository <Tipo, Integer>  {
	

}
