package br.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="TBAluno")
public class Aluno {

	@Id 
	private int cod;
	
	
	@Column (name="vNome", nullable=false, length=15)
	private String nome;
	
	@Column (name="vFone", length=11)
	private String fone;


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public String getFone() {
		return fone;
	}
	
}
