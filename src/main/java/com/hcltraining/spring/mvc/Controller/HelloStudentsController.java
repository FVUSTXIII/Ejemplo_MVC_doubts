package com.hcltraining.spring.mvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class HelloStudentsController {
	
	@RequestMapping("/muestra-formulario")
	public String muestraFormulario() { //Proporciona el formulario
		
		return "HolaAlumnosFormulario";
		
	}
	
	@RequestMapping("/procesar-formulario")
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesar-formulario-2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		//String nombre = request.getParameter("nombreAlumno");
		nombre += " es el mejor alumno";
		
		String mensaje_final = "¿Quíen es el mejor alumno? " + nombre ;
		modelo.addAttribute("mensaje_claro", mensaje_final);
		return "HolaAlumnosSpring";
	}
}
