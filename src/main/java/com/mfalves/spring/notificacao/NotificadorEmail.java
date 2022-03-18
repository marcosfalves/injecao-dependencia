package com.mfalves.spring.notificacao;

import com.mfalves.spring.domain.model.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta = false;
	private String hostServidorSMTP;
	
	public NotificadorEmail (String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
		System.out.println("Construtor de NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando o cliente %s atráves do e-mail %s e servidor SMTP %s. Mensagem: %s\n",
				cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
		
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
