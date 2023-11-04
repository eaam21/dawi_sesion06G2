package org.ciberfarma.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="tb_usuarios")
public class Usuario {
	@Id
	@Column(name="cod_usua")
	private int codUsua;
	
	@Column(name="nom_usua")
	private String nomUsua;
	
	@Column(name="ape_usua")
	private String apeUsua;
	
	@Column(name="usr_usua")
	private String usrUsua;
	
	@Column(name="cla_usua")
	private String claUsua;
	
	public Usuario() {
	}

	/*Getter y Setter*/
	public int getCodUsua() {
		return codUsua;
	}

	public void setCodUsua(int codUsua) {
		this.codUsua = codUsua;
	}

	public String getNomUsua() {
		return nomUsua;
	}

	public void setNomUsua(String nomUsua) {
		this.nomUsua = nomUsua;
	}

	public String getApeUsua() {
		return apeUsua;
	}

	public void setApeUsua(String apeUsua) {
		this.apeUsua = apeUsua;
	}

	public String getUsrUsua() {
		return usrUsua;
	}

	public void setUsrUsua(String usrUsua) {
		this.usrUsua = usrUsua;
	}

	public String getClaUsua() {
		return claUsua;
	}

	public void setClaUsua(String claUsua) {
		this.claUsua = claUsua;
	}
}
