package com.mfalves.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mfalves.spring.domain.service.AtivacaoClienteService;
import com.mfalves.spring.notificacao.Notificador;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
