package br.unitins.trabalho2.application;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
	
		public static void redirect(String url) {
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect(url);
			} catch (IOException e) {
				addMessageError("Erro no redirecionamento da página");
				e.printStackTrace();				
			}
				
			
		}

		public static void addMessageError(String message) {
			
			FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(message));
		}
}
