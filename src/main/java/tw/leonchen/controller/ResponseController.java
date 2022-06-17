package tw.leonchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {
	
	@GetMapping(path="/responsebody.controller")
	@ResponseBody
	public String processResponseBodyAction() {
		return "Have a nice day !!";
	}
	@GetMapping(path="/responsebody2.controller",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String processResponseBodyAction2() {
		return "Have a nice day 你好 !!";
	}

}
