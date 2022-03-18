package com.mfalves.spring.domain.service;

import com.mfalves.spring.domain.model.Cliente;
import com.mfalves.spring.notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
		
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("Construtor de AtivacaoClienteService: " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
