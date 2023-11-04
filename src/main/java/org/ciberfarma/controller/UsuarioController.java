package org.ciberfarma.controller;

import org.ciberfarma.model.Usuario;
import org.ciberfarma.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsuarioController {
	@Autowired
	private IUsuarioRepository usua;
	
	@GetMapping("/")
	public String loginFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@PostMapping("/validar")
	public String validarLogin(@ModelAttribute Usuario usuario, RedirectAttributes attribute) {
		Usuario usuarioEncontrado = usua.findByUsrUsuaAndClaUsua(usuario.getUsrUsua(), usuario.getClaUsua());
		if(usuarioEncontrado != null) {
			return "redirect:/listar";
		}else {
			attribute.addFlashAttribute("mensaje","Error iniciando sesión!");
			return "redirect:/";
		}
	}
}
