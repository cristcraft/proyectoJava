package com.pureba.controladores;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class ControladorInicial {

    @GetMapping("/")
	public String pageMain(Model parametros){
		String datos = "Asi se envia un parametro a html desde java con spring boot";

		parametros.addAttribute("clave", datos);
		return "index";
	}
	
	String dato;
	@GetMapping("/prueba")
	public String saludo(Model parametros) {
		Usuario ul = new Usuario();
		ul.setCedula("1234");
		ul.setContra("1234");
		ul.setName("cristian");
		ul.setemail("crsitmateus29@gmail.com");

		parametros.addAttribute("alguien", ul);

		return "prueba";	
	}
    
}
