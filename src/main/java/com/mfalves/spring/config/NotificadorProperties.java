package com.mfalves.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
    /**
     * Endereço do servidor de e-mail
     * */
    private String hostServidor;
    /**
     * Porta do servidor de e-mail
     * */
    private Integer portaServidor = 25;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
