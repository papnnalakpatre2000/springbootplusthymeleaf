package com.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/about")
	public String getAbout(Model model) {
		System.out.println("Hello papnna this is about section");
		model.addAttribute("name","papnna");
		model.addAttribute("yeas","total 2.1 years of experiance in java and springboot");
		model.addAttribute("check",false);
		model.addAttribute("text","PAPNNA");
		model.addAttribute("port",port);
		model.addAttribute("list",getList());
		return "about";
	}
	
	public List<String> getList(){
		List<String> list=List.of("Hello","Papnna","How","Are","You");
		return list;
	}

}
