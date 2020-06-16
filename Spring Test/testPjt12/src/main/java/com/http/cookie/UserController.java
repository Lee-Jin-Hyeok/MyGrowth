package com.http.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value="/loginOk", method={RequestMethod.GET, RequestMethod.POST})
	public String login(User user, HttpServletResponse response) {
		Cookie cookie = new Cookie("userId", user.getUserId());
		
		if(!(user.isUseCookie())) {
			cookie.setMaxAge(0);
			System.out.println("ÄíÅ° ¾øÀ½");
		} else {
			cookie.setMaxAge(60 * 60 * 24);
			System.out.println("ÄíÅ° »ý¼º");
		}
		cookie.setDomain("dfadfasdf");
		System.out.println(cookie.getDomain());
		cookie.setPath("dfasdfa");
		System.out.println(cookie.getPath());
		
		response.addCookie(cookie);
		
		return "loginOk";
	}
}