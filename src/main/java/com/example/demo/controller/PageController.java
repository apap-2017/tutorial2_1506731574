package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
	@RequestMapping("/hello")
	public String index ()
	{
		return "hello";
	}

	@RequestMapping("/greeting")
	public String greeting (@RequestParam(value = "name") String name, Model model)
	{
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping("/perkalian")
	public String index(@RequestParam(value = "a", required = false, defaultValue = "0") Integer a,
	                    @RequestParam(value = "b", required = false, defaultValue = "0") Integer b,
	                    Model model)
	{
		int hasil =  a * b;
	    model.addAttribute("a", a);
	    model.addAttribute("b", b);
	    model.addAttribute("hasil", hasil);
	    return "perkalian";
	}
}
