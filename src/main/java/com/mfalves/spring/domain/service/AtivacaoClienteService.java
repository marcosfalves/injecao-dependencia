package com.mfalves.spring.domain.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mfalves.spring.domain.model.Cliente;
import com.mfalves.spring.notificacao.NivelUrgencia;
import com.mfalves.spring.notificacao.Notificador;
import com.mfalves.spring.notificacao.TipoNotificador;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService implements InitializingBean, DisposableBean {

	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	//@PostConstruct
	public void init(){
		System.out.println("INIT " + notificador);
	}

	//@PreDestroy
	@Override
	public void destroy(){
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT " + notificador);
	}
}
