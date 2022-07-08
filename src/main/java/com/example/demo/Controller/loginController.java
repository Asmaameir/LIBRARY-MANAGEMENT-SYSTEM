package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class loginController {
	@GetMapping("/login")
	public String ListPatients(Model model) {
		return "/login";
		}

}
