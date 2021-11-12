package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comingSoon")
/**
 * A page used to show the artists upcoming projects
 * @author Max Weber
 *
 */
public class ComingSoonController
{
	@GetMapping({"","/"})
	public String display()
	{
		return "comingSoon.html";
	}
}
