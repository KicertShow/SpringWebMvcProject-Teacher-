package tw.leonchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.leonchen.model.hhhhh;
@Controller
public class MY {
	
	@GetMapping(path = "/123")
//	@GetMapping(path = "/memebersMain.controller") 新型寫法 固定get
//	@GetMapping("/memebersMain.controller")   新型寫法
	public String kenny(Model m) {
		hhhhh aaa = new hhhhh();
		m.addAttribute("account", aaa);
		return "kenny";
	}
	
	
	@RequestMapping(path = "/xxxxxxx",method = RequestMethod.POST)
	public String myAction(@ModelAttribute("account")hhhhh hh,BindingResult result,Model m2) {
		if (result.hasErrors()) {
			return "yyyyy";
		}
		m2.addAttribute("account", hh.getAccount());
		m2.addAttribute("password", hh.getPassword());
		return "gogo";
	}
}
