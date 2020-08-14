package com.xiilab.eightentest.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value ="/main", method = RequestMethod.GET)
	public String mainPage(Locale locale, Model model) {
		
		return "main";
	}

	@RequestMapping(value = "/intro_company", method = RequestMethod.GET)
	public String introduceCom(Locale locale, Model model) {
		
		return "/intro_company";
	}
	
	@RequestMapping(value = "/intro_education", method = RequestMethod.GET)
	public String introduceEdu(Locale locale, Model model) {
		
		return "/intro_education";
	}
	
	@RequestMapping(value = "/intro_value", method = RequestMethod.GET)
	public String introduceVal(Locale locale, Model model) {
		
		return "/intro_value";
	}
	
	@RequestMapping(value = "/intro_curriculum", method = RequestMethod.GET)
	public String eduSystem(Locale locale, Model model) {
		
		return "/intro_curriculum";
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testAPI(Locale locale, Model model) {
		
		return "/test";
	}
	
	@RequestMapping(value = "/intro_join", method = RequestMethod.GET)
	public String questionJoin(Locale locale, Model model) {
		
		return "/intro_join";
	}
	
	@RequestMapping(value = "/intro_admission", method = RequestMethod.GET)
	public String questionAdmission(Locale locale, Model model) {
		
		return "/intro_admission";
	}
	
}
