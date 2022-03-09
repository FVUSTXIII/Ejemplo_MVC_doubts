package com.hcltraining.spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Relative Mapping

@Controller
@RequestMapping("/secundario")
public class BreakDummyController {
	@RequestMapping("/muestra-formulario")
	public String muestraFormulario() { //Proporciona el formulario
		
		return "HolaAlumnosFormulario";
		
	}
	@RequestMapping("/procesar-formulario-2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		//String nombre = request.getParameter("nombreAlumno");
		nombre += " es el peor alumno";
		
		String mensaje_final = "¿Quíen es el peor alumno? " + nombre ;
		modelo.addAttribute("mensaje_claro", mensaje_final);
		return "HolaAlumnosSpring";
	}
}
