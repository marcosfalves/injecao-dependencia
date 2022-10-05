package com.mfalves.spring.listener;

import com.mfalves.spring.domain.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class NotaFiscalListener {

    @EventListener
    @Order(2)
    public void clientAtivadoListener(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
    }
}
