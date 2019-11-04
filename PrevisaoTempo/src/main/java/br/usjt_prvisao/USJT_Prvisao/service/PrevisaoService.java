package br.usjt_prvisao.USJT_Prvisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt_prvisao.USJT_Prvisao.model.Previsao;
import br.usjt_prvisao.USJT_Prvisao.repository.PrevisaoRepo;

@Service
public class PrevisaoService {
	
	@Autowired
	private static PrevisaoRepo previsao;
	

	
	public static void salvar(Previsao previsao) {previsao.save(previsao);}
	
	public List<Previsao> listarTodos() {
		List<Previsao> Previsao = previsao.findAll();

		return Previsao;
	}
}
