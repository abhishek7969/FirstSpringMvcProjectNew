package com.abhi.controller.hello;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping(value = "/welcome",method=RequestMethod.GET)
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This Message is from the new controller.");
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiMsg(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This Message is from second controller.");
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{countyname}/{username}")
	public ModelAndView getCountryUsername(@PathVariable("countyname") String c1, @PathVariable("username") String c2){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hello from "+c2+ " who belongs to country "+c1);
		return model;
	}
	
	@RequestMapping("/pathVarMap/{countyname}/{username}")
	public ModelAndView getPathFromMap(@PathVariable Map<String, String> vars){
		String c1= vars.get("countyname");
		String c2 = vars.get("username");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hello from "+c2+ " who belongs to country "+c1);
		return model;
	}
	
	
}
