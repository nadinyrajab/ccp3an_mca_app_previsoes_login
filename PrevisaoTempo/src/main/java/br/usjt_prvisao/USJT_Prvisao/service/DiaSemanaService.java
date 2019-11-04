package br.usjt_prvisao.USJT_Prvisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt_prvisao.USJT_Prvisao.model.DiaSemana;
import br.usjt_prvisao.USJT_Prvisao.repository.DiaRepo;
@Service
public class DiaSemanaService {
	
	@Autowired
	private DiaRepo diaRepo;
	
	public void salvar(DiaSemana diaSemana) {diaRepo.save(diaSemana);}
	
	public List<DiaSemana> listarTodos() {
		List<DiaSemana> dias = diaRepo.findAll();
		return dias;
	}

}
