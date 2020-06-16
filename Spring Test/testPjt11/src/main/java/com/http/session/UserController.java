package com.http.session;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	private Map<String, User> database;
	
	public UserController() {
		this.database = new HashMap<String, User>();
	}
	
	@RequestMapping(value="/loginOk", method={RequestMethod.GET, RequestMethod.POST})
	public String login(User user, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("hello", "Hello, World");
		System.out.println(session.getId());
		
		User temp = database.get(user.getUserId());
		if(temp.getUserPw().equals(user.getUserPw()))
			return "loginOk";
		else
			return "error";
	}
	
	@RequestMapping(value="/joinOk", method={RequestMethod.GET, RequestMethod.POST})
	public String join(User user) {
		database.put(user.getUserId(), user);
		return "joinOk";
	}
	
	@RequestMapping(value="/changeOk", method={RequestMethod.GET, RequestMethod.POST})
	public String change(Model model, User user, HttpServletRequest request) {
		System.out.println(request.getSession().getAttribute("hello"));
		String userId = request.getParameter("existingUserId");
		String userPw = request.getParameter("existingUserPw");
		String userMail = request.getParameter("existingUserMail");
		String userAge = request.getParameter("existingUserAge");
		
		database.remove(database.get(userId).getUserId());
		
		database.put(user.getUserId(), user);
		
		model.addAttribute("userId", userId);
		model.addAttribute("userPw", userPw);
		model.addAttribute("userMail", userMail);
		model.addAttribute("userAge", userAge);
		
		return "changeOk";
	}
	
	@RequestMapping(value="/deleteOk", method={RequestMethod.GET, RequestMethod.POST})
	public String delete(User user) {
		database.remove(user.getUserId());
		return "deleteOk";
	}
}