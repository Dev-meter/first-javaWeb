package com.dawi_t1_canchari_jennifer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "atencion")
public class Atencion {
	@Id
	private int num_atencion;
	private String fecha;
	private String nom_paciente;
	
	
	@ManyToOne
	@JoinColumn (name= "cod_tipo_atencion")
	private Tipo tipoAtencion;
}
