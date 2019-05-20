package org.java.web;

import org.java.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest req) {
		List<Map<String, Object>> list = service.findAll();
		req.setAttribute("list", list);
		return "/show";
	}
	
}
