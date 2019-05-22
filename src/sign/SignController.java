package sign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class SignController {
	@RequestMapping("/index")
	public String index() {
		return "/WEB-INF/view/sign.html";
	}
    @RequestMapping(value = "/login.action",method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){  
         ModelAndView modelAndView = new ModelAndView("Login");
         return modelAndView;
    }
    @RequestMapping(value = "login.action",method = RequestMethod.POST)
    public String clientLogin(HttpServletRequest request,HttpServletResponse response){ 
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username.equals("nmc")&&password.equals("123456")){  
            //登陆成功  
            request.getSession().setAttribute("username",username);  
            return "redirect:/student/get";  
        }else{  
            //登陆失败  
            return "forward:/login/login.action";  
        }  
    } 

}
