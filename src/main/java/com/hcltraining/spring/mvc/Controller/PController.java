package com.hcltraining.spring.mvc.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {
	@RequestMapping("/")
	public String muestraPagina() {
		return "paginaEjemplo";
	}
}
