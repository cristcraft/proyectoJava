package com.pureba.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping()
public class prueba {
    @GetMapping("/prueba")
	public String saludo(@RequestParam(value = "name", defaultValue = "World") String xyz) {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yy hh:mm: ");
		Date fecha = new Date();
		return "Prueba desde path" + date.format(fecha);
	}
}
