package com.mfalves.spring.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mfalves.spring.domain.model.Cliente;

@Qualifier("prioridade-urgente")
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando o cliente %s atráves do telefone %s  Mensagem: %s\n", cliente.getNome(),
				cliente.getTelefone(), mensagem);
	}

}
