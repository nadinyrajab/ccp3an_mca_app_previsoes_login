package br.usjt_prvisao.USJT_Prvisao.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_semana")

@Getter @Setter @ToString

public class DiaSemana {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_semana")
	private Long id;
	
	@Column(name = "dia_semana")
	private String Dia;
	
	@OneToOne(optional=true,  cascade = CascadeType.ALL)
	@JoinColumn (name = "Previsao")
	private Previsao previsao;

}
