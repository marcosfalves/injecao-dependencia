package com.mfalves.spring.notificacao;

import com.mfalves.spring.domain.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("Notificador E-mail MOCK");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Simulando notificação para o cliente %s atráves do e-mail %s  Mensagem: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
