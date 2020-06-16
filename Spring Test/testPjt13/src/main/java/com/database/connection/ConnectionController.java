package com.database.connection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnectionController {
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert(User user) {
		
		return "insert";
	}
	
	@RequestMapping(value="/select", method=RequestMethod.GET)
	public String select(Model model) {
		
		return "select";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(User user) {
		
		return "update";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Model model) {
		
		return "delete";
	}
}