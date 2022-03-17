package com.mfalves.spring.notificacao;

import com.mfalves.spring.domain.model.Cliente;

public interface Notificador {
	
	public void notificar(Cliente cliente, String mensagem);

}
