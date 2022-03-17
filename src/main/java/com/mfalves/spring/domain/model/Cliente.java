package com.mfalves.spring.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public void ativar() {
		this.ativo = true;
	}

}
