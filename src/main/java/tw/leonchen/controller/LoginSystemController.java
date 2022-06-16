package tw.leonchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginSystemController {
	@RequestMapping(path = "/loginststemmain.controller",method = RequestMethod.GET)
	public String processMainAction() {
		return "loginSystem";
	}
}
