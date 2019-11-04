package br.usjt_prvisao.USJT_Prvisao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt_prvisao.USJT_Prvisao.model.Cidade;

public interface CidadeRepo extends JpaRepository<Cidade, Long> {
	
		public List <Cidade> findByLatitudeAndLongitude (Double latitude, Double longitude);

		public List <Cidade> findByNome (String nome);

		public default boolean IngoreCase(String nome1, String nome2)
		{ 
			
			boolean equals1 = nome1.equalsIgnoreCase(nome1);
					return true;
		};

}
