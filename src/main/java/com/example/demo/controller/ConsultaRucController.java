package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.modelo.DetalleRuc;

@RestController
public class ConsultaRucController {

	@Autowired
	RestTemplate restTemplate;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/consultaRuc")
	public DetalleRuc consulta(@RequestParam(value = "ruc") String ruc) {
		
		DetalleRuc detalleRuc = consultaServicio(ruc);
		return detalleRuc;
	}
	
	private DetalleRuc consultaServicio(String ruc) {
		DetalleRuc detalleRuc = restTemplate.getForObject("http://wsruc.com/Ruc2WS_JSON.php?tipo=2&ruc="+ ruc +"&token=cXdlcnR5bGFtYXJja19zYUBob3RtYWlsLmNvbXF3ZXJ0eQ==", DetalleRuc.class);
		return detalleRuc;
	}
}
