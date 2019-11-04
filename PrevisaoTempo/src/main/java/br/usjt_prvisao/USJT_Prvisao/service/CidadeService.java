package br.usjt_prvisao.USJT_Prvisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt_prvisao.USJT_Prvisao.model.Cidade;
import br.usjt_prvisao.USJT_Prvisao.repository.CidadeRepo;
@Service
public class CidadeService {
	@Autowired
	private CidadeRepo cidadeRepo;
	
	public void salvar(Cidade cidade) {
		cidadeRepo.save(cidade);
	}
	
	public List<Cidade> listarTodos() {
		List<Cidade> cidades = cidadeRepo.findAll();
		return cidades;
	}

}
