package br.unitins.trabalho2.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.trabalho2.application.Util;

@Named
@RequestScoped
public class MenuController implements Serializable{

	private static final long serialVersionUID = 1779838185314783571L;
	
	public void login() {
		Util.redirect("login.xhtml");
			
	}
	public void cadastroUsuario() {
		Util.redirect("usuario.xhtml");
			
	}
	public void cadastroProduto() {
		Util.redirect("hello.xhtml");
		
	}

}
