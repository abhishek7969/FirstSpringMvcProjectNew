package com.abhi.controller.student;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.model.Student;


@Controller
public class StudentAdmissionController {
	
	/**
	 * Spring will not apply its default binding mechanism for the studentMobile field.
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		/**
		 * will not be binded by the Spring MVC
		 */
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		
		/**
		 * spring uses build in property editor(file/class/custom number editor) for type convention while doing data binding.
		 */
		SimpleDateFormat sf = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class, "studentDOB",new CustomDateEditor(sf, false));
		
		/**
		 * Spring MVC will not bind the studentName property, unless it consults the custom property editor StudentNameEditor
		 */
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	/**
	 * This controller will returns the Admission Form for the user.
	 * @return
	 */
	@RequestMapping(value = "/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception{
		
//		String exceptionOccured = "NULL_POINTER";
		String exceptionOccured = "IO_Exceptions";

		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			throw new NullPointerException("Null pointer exceptions");
		}
		else if (exceptionOccured.equalsIgnoreCase("IO_Exceptions")) {
			throw new StackOverflowError("IO exceptions");
		}
		
		
		ModelAndView model = new ModelAndView("AdmissionForm");
	   //model.addObject("headerMsg", "CHAMP COLLEGE OF ENGINEERING");	 //commented as called generically by the use of the @modelAttribute annotation
		return model;
	}
	
	
	/**
	 * If studentName is left bank it will pass on the default value for the field which is "Mr Abhishek Rathur"
	 * @param uname
	 * @param hobbie
	 * @return
	 *//*
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitStudentDetails(@RequestParam(value="studentName" ,defaultValue="Mr Abhishek Rathur") String uname, @RequestParam("studentHobbie") String hobbie){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "My name is " + uname+" and my hobbie is "+hobbie);		
		return model;
		
	}*/
	
	/**
	 * Creating a Student Obj and feeding all the values received from the form , when submitted, 
	 * We can use @modelAttribute to overcome all these overheads.
	 * @param uname
	 * @param hobbie
	 * @return
	 *//*
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitStudentDetails(@RequestParam(value="studentName" ,defaultValue="Mr Abhishek Rathur") String uname, @RequestParam("studentHobbie") String hobbie){
		
		Student stu = new Student();
		stu.setStudentName(uname);
		stu.setStudentHobbie(hobbie);		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMsg", "CHAMP COLLEGE OF ENGINEERING");	
		model.addObject("stuObj",stu);
		return model;		
	}*/
	
	/**
	 * We can use @modelAttribute using which spring will bind all the form values for us.kind of autowindings for the fields.
	 * @modelAttribute can also be applied on the method levels.
	 * @param uname
	 * @param hobbie
	 * @return
	 */
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitStudentDetails(@Valid @ModelAttribute("stuObj") Student student,BindingResult results){

		if(results.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMsg", "CHAMP COLLEGE OF ENGINEERING");	 //commented as called generically by the use of the @modelAttribute annotation
		return model;		
	}
	
	/**
	 * It is called before call to any controller.
	 * @param model
	 */
	@ModelAttribute
	public void addHeader(Model model){
		model.addAttribute("headerMsg", "CHAMP COLLEGE OF ENGINEERING");
	
	}	

}
