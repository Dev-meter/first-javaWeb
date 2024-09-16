package com.dawi_t1_canchari_jennifer.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawi_t1_canchari_jennifer.model.Atencion;
import com.dawi_t1_canchari_jennifer.service.AtencionService;

@Controller
public class AtencionController {
	@Autowired
	private AtencionService servicio;

	@GetMapping({"/","/cargar"})
	 public String cargarPagCrud(Model model) {
		 model.addAttribute("atencion", new Atencion());
		 model.addAttribute("lstTipos", servicio.listaTipos());
		 model.addAttribute("lstAtenciones", servicio.listaAtenciones());
		 
		 return "atencionesCanchari";
	 }
	
	 @PostMapping("/grabar")
	 public String grabarPagCrud(@ModelAttribute Atencion atencion,  Model model) {
		 try {
			 servicio.grabarAtencion(atencion);
			 model.addAttribute("mensaje", "Registro guardado con éxito."); 
			 model.addAttribute("cssmensaje", "alert alert-success");
			 
		 } catch (Exception e) {
			 model.addAttribute("mensaje", "¡Error al guardar el registro! "+ ""+ "Completa correctamente."); 
			 model.addAttribute("cssmensaje", "alert alert-danger"); 
		 }
		 
		 model.addAttribute("lstTipos", servicio.listaTipos());
		 model.addAttribute("lstAtenciones", servicio.listaAtenciones());
		 return "atencionesCanchari";
	 }
	 
	 /*@GetMapping("/atenc")
	 public String mostrar(@RequestParam(value="cod_tipo_atencion", required=false) Integer cod_tipo_atencion, Model model) {
		 List<Atencion> atenciones;
		 if(cod_tipo_atencion !=null) {
			 atenciones = servicio.buscarPaciente(cod_tipo_atencion);
		 }else {
			 atenciones = servicio.buscarPaciente(0);
		 }
		 model.addAttribute("atenciones", atenciones);
		 return "atenciones";
	 }
	 */
}


















