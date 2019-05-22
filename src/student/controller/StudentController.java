package student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import student.service.StudentServiceInterface;
import student.pojo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceInterface studentService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getStudent(String name,HttpServletRequest request,HttpServletResponse response) {
        List<Student> result = studentService.getStudent(name);
        System.out.println(result);
        
        request.setAttribute("stulist", result);
        
        return "/WEB-INF/view/getStudent.jsp";
	}
	@RequestMapping(value = "/change")
	public String addStudent(@RequestParam(value="id",required=false)String id,HttpServletRequest request,HttpServletResponse response) {
		List<Student> list=studentService.getStudentId(id);
		for(Student li:list) {
			System.out.println(li.getId()+"\t"+li.getName());
			request.setAttribute("id",li.getId());
			request.setAttribute("name", li.getName());
		}
		studentService.removeStudent(id);
		return "/WEB-INF/view/changeStudent.jsp";
	}
	@RequestMapping(value = "/remove")
	public String removeStudent(@RequestParam(value="id" ,required=false)String id,HttpServletRequest request,HttpServletResponse response) {
		studentService.removeStudent(id);
		return  "redirect:get?name=";
	}
	@RequestMapping(value="/changeinfo")
	public String changeStudent (Student stu) {
		System.out.println("调用改变学生方法");		
		System.out.println(stu.getName());
		studentService.addStudent(stu);
		
		return "redirect:get?name=";	
	}
	@RequestMapping(value="/addstudent")
	public String add(Student stu) {
		return "/WEB-INF/view/addStudent.jsp";	
	}
	@RequestMapping(value="/add")
	public String addstu(Student stu) {
		studentService.addStudent(stu);
		return "redirect:get?name=";
	}
}