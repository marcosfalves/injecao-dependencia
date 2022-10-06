package com.mfalves.spring.notificacao;

import com.mfalves.spring.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

	@Value("${notificador.email.host-servidor}")
	private String host;

	@Value("${notificador.email.porta-servidor}")
	private Integer porta;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + host);
		System.out.println("Porta: " + porta);

		System.out.printf("Notificando o cliente %s atráves do e-mail %s  Mensagem: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}
}
