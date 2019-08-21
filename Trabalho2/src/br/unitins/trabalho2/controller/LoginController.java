package br.unitins.trabalho2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.unitins.trabalho2.application.Util;
import br.unitins.trabalho2.model.Usuario;

@Named
@RequestScoped
public class LoginController {

	private Usuario usuario;
	
	private List<Usuario> listaUsuario;
	
	public List<Usuario> getListaUsuario(){
		if (listaUsuario == null) {
			listaUsuario = new ArrayList<Usuario>();
			listaUsuario.add(new Usuario("Teste","teste","123"));
			listaUsuario.add(new Usuario("User","User","123"));
		}
		return listaUsuario;
	}

	public void entrar() {
		for(Usuario u: getListaUsuario()) {
			if (u.getNome().equals(getUsuario().getNome()) && u.getLogin().equals(getUsuario().getLogin())
						&& u.getSenha().equals(getUsuario().getSenha())) {
					Util.redirect("menu.xhtml");
				}
			System.out.println(getUsuario().getNome());
			System.out.println(getUsuario().getLogin());
			System.out.println(getUsuario().getSenha());
			}
		Util.addMessageError("Usuario ou Senha Inválido");
//		return null;
		}

	
	public Usuario getUsuario() {
		if(usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void incluir() {
		getListaUsuario().add(getUsuario());
		System.out.println(getUsuario().getNome());
		System.out.println(getUsuario().getLogin());
		System.out.println(getUsuario().getSenha());
		System.out.println(getUsuario().getAtivo());
		
		limpar();
		//Util.addMessageError("Campos vazios, por favor preencha os dados.");
	}
	
	public void limpar() {
		setUsuario(null);
	}
	
	
//	public String logar() {
//		if (getUsuario().getLogin().equals("teste")
//				&& getUsuario().getSenha().equals("123")) {
//			
//		System.out.println(getUsuario().getLogin());
//		System.out.println(getUsuario().getSenha());
//		return "menu.xhtml?faces-redirect=true";//redireciona a página correta
//		}
//		Util.addMessageError("Usuario ou Senha Inválido");
//		return null;
//	}
	
	

	

}
