package at.stderr.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	
    @Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create student
		Student theStudent= new Student();
		
		// add student to model
		theModel.addAttribute("student", theStudent);
	    theModel.addAttribute("theCountryOptions", countryOptions); 
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		
		System.out.println("theStudent: " + theStudent.getFirstName()
				+ " " 
				+ theStudent.getLastName()
				+ " "
				+ theStudent.getCountry());

		return "student-confirmation";

	}

}
