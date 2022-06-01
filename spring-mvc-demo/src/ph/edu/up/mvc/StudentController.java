package ph.edu.up.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ph.edu.up.mvc.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student newStudent = new Student();
		model.addAttribute("student", newStudent);
		return "student-form";
	}
	
	@RequestMapping("/showConfirmation")
	public String showConfirmation(@ModelAttribute("student") Student student) {
		return "student-confirmation";
	}

}
