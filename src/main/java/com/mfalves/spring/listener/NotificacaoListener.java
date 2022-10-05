package com.mfalves.spring.listener;

import com.mfalves.spring.domain.service.ClienteAtivadoEvent;
import com.mfalves.spring.notificacao.NivelUrgencia;
import com.mfalves.spring.notificacao.Notificador;
import com.mfalves.spring.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoListener {

    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    @Order(1)
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
