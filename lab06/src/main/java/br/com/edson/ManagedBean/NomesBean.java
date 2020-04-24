package br.com.edson.ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class NomesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome = "";
	private List<String> nomes = new ArrayList<>();
	
	public void adicionar() {
		this.nomes.add(this.nome);
		this.nome = "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getNomes() {
		return nomes;
	}
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	
}
