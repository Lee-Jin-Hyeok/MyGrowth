package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestClass {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test(Model model) {
		
		model.addAttribute("SpringVersion", org.springframework.core.SpringVersion.getVersion());
		
		return "test";
	}
}