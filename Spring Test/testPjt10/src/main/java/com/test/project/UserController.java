package com.test.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String userJoin(Model model, HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userAge = request.getParameter("userAge");
		String userMail = request.getParameter("userMail");
		
		System.out.println("userId : " + userId);
		System.out.println("userPw : " + userPw);
		System.out.println("userAge : " + userAge);
		System.out.println("userMail : " + userMail);
		
		service.userInsert(userId, userPw, userAge, userMail);
		
		model.addAttribute("userId", userId);
		model.addAttribute("userPw", userPw);
		model.addAttribute("userAge", userAge);
		model.addAttribute("userMail", userMail);
		
		return "userJoinOK";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String userLogin(Model model, HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");

		System.out.println("userId : " + userId);
		System.out.println("userPw : " + userPw);
		
		User user = service.userFind(userId, userPw);
		
		try {
			model.addAttribute("userId", user.getUserId());
			model.addAttribute("userPw", user.getUserPw());
		} catch(NullPointerException e) {
			System.out.println("일치하는 회원정보가 존재하지 않습니다.");
			return "error";
		} catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
		
		return "userLoginOK";
	}
}