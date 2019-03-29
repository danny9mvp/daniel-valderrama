package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HabilidadesController {
	@GetMapping("/habilidades")
	public String habilidades(){
		return "habilidades";
	}
}
