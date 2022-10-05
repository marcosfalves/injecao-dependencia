package com.mfalves.spring.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.mfalves.spring.domain.model.Cliente;

@Profile("prod")
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

	public NotificadorEmail() {
		System.out.println("Notificador E-mail REAL");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando o cliente %s atráves do e-mail %s  Mensagem: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
