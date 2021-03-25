package com.rodrigo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Pessoa;
	
    private String nome;
    private String usuario;
    private String senha;
    private String sexo;
    private String email;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    //@Temporal(TemporalType.DATE)
    //private Date dataCadastro;
    
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    //@Temporal(TemporalType.DATE)
    //private Date dataAtualizacao;
    
    private String naturalidade;
    private String nacionalidade;
    private String cpf;
    
	public int getId_Pessoa() {
		return id_Pessoa;
	}
	public void setId_Pessoa(int id_Pessoa) {
		this.id_Pessoa = id_Pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dtNascimento) {
		this.dataNascimento = dtNascimento;
	}/*
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}*/
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Pessoa;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id_Pessoa != other.id_Pessoa)
			return false;
		return true;
	}
    
}
