package br.usjt_prvisao.USJT_Prvisao.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "tb_previsao")
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_previsao")
	private long id;
	
	@Column(name = "tempmin_previsao")
	private Double temperaturaMin;
	@Column(name = "tempmax_previsao")
	private Double temperaturaMax;
	@Column(name = "humidade_previsao")
	private Double humidade;
	@Column(name = "desc_previsao")
	private String descricao;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	public Double getHumidade() {
		return humidade;
	}
	/**
	 * @param humidade the humidade to set
	 */
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@OneToOne(optional=true, cascade = CascadeType.ALL)
	@JoinColumn (name = "id_semana")
	private DiaSemana diaSemana;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="id_cidade")
	private Cidade cidade;
	
	
	
}