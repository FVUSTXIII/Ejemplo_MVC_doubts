package com.hcltraining.spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/show-form")
	public String showForm(Model model) {
		Student _std = new Student();
		model.addAttribute("student", _std);
		return "studentRegistryForm";
	}
	
	@RequestMapping("procesar-formulario")
	public String processForm(@ModelAttribute("student") Student std_) {
		
		
		return "StudentRegistryConfirmation";
	}
}
