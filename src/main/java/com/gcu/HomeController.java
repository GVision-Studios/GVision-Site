package com.gcu;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

	




@GetMapping("/payment")

public String getPayment(Model model) {
	
	model.addAttribute("processinformation", new FormSubmission());
	return "payment";
	
	
}

@RequestMapping("/processpayment")
public ModelAndView processPayment() {
	

	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("paymentsubmission");
	return modelAndView;
	
}



@PostMapping("/informationsubmit")
public String informationSubmit(@ModelAttribute FormSubmission formsubmission ,Model model) {
	
	model.addAttribute("processinformation", formsubmission);
	return "paymentsubmission";
}

@RequestMapping("/contactus")

public ModelAndView getContact() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("Contactus");
	return modelAndView;
}



@RequestMapping("/")

public ModelAndView gethome() {
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("home");
	return modelAndView;
}




}
