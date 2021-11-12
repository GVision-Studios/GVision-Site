package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/comingSoon")
/**
 * A page used to show the artists upcoming projects
 * @author Max Weber
 *
 */
public class ComingSoonController
{
	@RequestMapping("/comingsoon")

	public ModelAndView getComingsoon() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("comingSoon");
		return modelAndView;
	}
}
