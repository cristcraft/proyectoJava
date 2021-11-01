package com.pureba.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	@GetMapping("/")
	public String pageMain(Model parametros){
		String datos = "Asi se envia un parametro a html desde java";

		parametros.addAttribute("clave", datos);
		return "prueba.html";
	}

	
	
	

}