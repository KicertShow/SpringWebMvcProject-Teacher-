package tw.leonchen.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes(names = {"userName"} )
public class HelloController2 {
	
	@RequestMapping(path = "/hell2omain.controller",method = RequestMethod.GET)
	public String processMainAction() {
		return "form";
	}
	
	
	@RequestMapping(path = "/hello2.controller",method = RequestMethod.GET)  //等於前端的action and 方法
	public String processAction(@RequestParam("userName") String userName,Model m,SessionStatus status) {
		//String userName = request.getParameter("userName"); 由上方取代
		Map<String, String> errors =new HashMap<String,String>();
		m.addAttribute("errors", errors);  //=request.setAttribute("errors", errors);
	
		if (userName==null || userName.length()==0) {
			errors.put("name", "name is required");
		}
	
		if (errors !=null && !errors.isEmpty()) {
//		return new  ModelAndView("/form.jsp");
			return "form";
		}
		m.addAttribute("userName", userName);
		
		status.setComplete();// 這行可以清掉 session的資料
		return "success";
	}
	
	@RequestMapping(path = "/hello2.controller",method = RequestMethod.POST)  //等於前端的action and 方法
	public String processAction2(@RequestParam("userName") String userName,Model m,SessionStatus status) {
		//String userName = request.getParameter("userName"); 由上方取代
		Map<String, String> errors =new HashMap<String,String>();
		m.addAttribute("errors", errors);  //=request.setAttribute("errors", errors);
	
		if (userName==null || userName.length()==0) {
			errors.put("name", "name is required");
		}
	
		if (errors !=null && !errors.isEmpty()) {
//		return new  ModelAndView("/form.jsp");
			return "form";
		}
		m.addAttribute("userName", userName);
		
		status.setComplete();// 這行可以清掉 session的資料
		return "success";
	}

	
}
