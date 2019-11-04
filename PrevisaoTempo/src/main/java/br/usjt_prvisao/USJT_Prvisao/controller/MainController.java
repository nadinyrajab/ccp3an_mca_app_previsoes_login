package br.usjt_prvisao.USJT_Prvisao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt_prvisao.USJT_Prvisao.model.Previsao;
import br.usjt_prvisao.USJT_Prvisao.model.Usuario;
import br.usjt_prvisao.USJT_Prvisao.service.LoginService;
import br.usjt_prvisao.USJT_Prvisao.service.PrevisaoService;


@Controller
public class MainController {
	//@Autowired
	//private PrevisaoRepo previsaoRepo;
	
	@Autowired
	private PrevisaoService previsaoService;

	@GetMapping("/previsao")
	public ModelAndView listarPrevisao() {
		ModelAndView mv = new ModelAndView("listPrevisao");
		List<Previsao> previsao = previsaoService.listarTodos();
		mv.addObject("previsao", previsao);
		mv.addObject(new Previsao());
		return mv;
	}

	@PostMapping
	public String salvar (Previsao previsao) {
		PrevisaoService.salvar(previsao);
		return "redirect:/previsao";
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");

		return mv;
	}

	@Controller
	public class LoginController {
		@Autowired
		private LoginService loginService;

		@GetMapping(value = { "/login", "/" })
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject(new Usuario());
			return mv;
		}

		@PostMapping("/fazerLogin")
		public String fazerLogin(Usuario usuario) {
			if (loginService.logar(usuario)) {
				return "redirect:previsao";
			} else {
				return "login";
			}
		}
	}
}
