package com.mfalves.spring.domain.service;

import org.springframework.stereotype.Component;

import com.mfalves.spring.domain.model.Cliente;
import com.mfalves.spring.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;
		
	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
