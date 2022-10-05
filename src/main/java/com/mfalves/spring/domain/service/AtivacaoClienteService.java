package com.mfalves.spring.domain.service;

import com.mfalves.spring.domain.model.Cliente;
import com.mfalves.spring.notificacao.NivelUrgencia;
import com.mfalves.spring.notificacao.Notificador;
import com.mfalves.spring.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
