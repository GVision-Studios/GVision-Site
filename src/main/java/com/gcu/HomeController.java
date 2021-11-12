package com.gcu;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class HomeController {

	


@RequestMapping("/")

public String getHome() {
	
	return "hello world";
}


@RequestMapping("/payment")

public ModelAndView getPayment() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("payment");
	return modelAndView;
}

@RequestMapping("/contactus")

public ModelAndView getContact() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("Contactus");
	return modelAndView;
}
}
