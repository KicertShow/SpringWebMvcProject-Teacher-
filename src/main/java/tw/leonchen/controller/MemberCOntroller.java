package tw.leonchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.leonchen.model.Member;

@Controller
public class MemberCOntroller {
	@RequestMapping(path = "/memebersMain.controller",method = RequestMethod.GET)
//	@GetMapping(path = "/memebersMain.controller") 新型寫法 固定get
//	@GetMapping("/memebersMain.controller")   新型寫法
	public String processMainAction(Model m) {
		Member mem = new Member("kitty","female",84);
		m.addAttribute("members", mem);
		return "members";
	}
	@RequestMapping(path = "/addMembers",method = RequestMethod.POST)
	public String processAction(@ModelAttribute("members")Member mem2,BindingResult result,Model m2) {
		if (result.hasErrors()) {
			return "membersError";
		}
		m2.addAttribute("mName", mem2.getMemberName());
		m2.addAttribute("mGender", mem2.getGender());
		m2.addAttribute("mAge", mem2.getAge());
		return "memberResult";
	}
}
