package com.mfalves.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mfalves.spring.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.mfalves.com.br");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail;
	}

}
