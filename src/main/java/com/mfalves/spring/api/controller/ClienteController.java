package com.mfalves.spring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfalves.spring.domain.model.Cliente;
import com.mfalves.spring.domain.service.AtivacaoClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private AtivacaoClienteService ativacaoClienteService;
		
	public ClienteController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping
	@ResponseBody
	public Cliente getCliente() {
		Cliente cliente = new Cliente("João Maria", "joaomaria@teste.com.br", "44 9 9999-9999", true);
		
		ativacaoClienteService.ativar(cliente);
				
		return cliente;
	}

}
