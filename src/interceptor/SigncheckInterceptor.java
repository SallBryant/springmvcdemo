package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SigncheckInterceptor implements HandlerInterceptor {
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
//        String requestURI = request.getRequestURI();  
//        if(requestURI.indexOf("/login")<=0){  
//            //说明处在编辑的页面  
//            HttpSession session = request.getSession();  
//            String username = (String) session.getAttribute("username");  
//            if(username!=null){  
//                //登陆成功的用户  
//                return true;  
//            }else{  
//               //没有登陆，转向登陆界面  
//                request.getRequestDispatcher("/WEB-INF/view/sign.html").forward(request,response); 
//              
//              return false;  
//            }  
//        }else{  
            return true;  
//        }  
    }
	
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
