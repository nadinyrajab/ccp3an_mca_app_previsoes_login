package br.usjt_prvisao.USJT_Prvisao.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity

@Table (name = "tb_cidade")
@Getter @Setter @ToString

public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cidade")
	private Long id;
	
	@Column(name = "nome_cidade")
	private String nome;
	
	@Column(name = "lat_cidade")
	private Double latitude;
	
	@Column(name = "lon_cidade")
	private Double longitude;
	
	
	
	
	@OneToMany (mappedBy= "cidade")
	private List<Previsao> previsoes;
}
