package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/muralsandpaintings")
public class MuralsAndPaintingsController
{
	@GetMapping({"","/"})
	public ModelAndView display()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("MuralsAndPaintings");
		return modelAndView;
	}
}
