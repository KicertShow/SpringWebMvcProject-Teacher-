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
		Member mem = new Member();
		m.addAttribute("members", mem);
		return "members";
	}

	@RequestMapping(path = "/addMembers",method = RequestMethod.POST)
	public String processAction(@ModelAttribute("members")Member member,BindingResult result,Model m2) {
		if (result.hasErrors()) {
			return "membersError";
		}
		m2.addAttribute("mName", member.getMemberName());
		m2.addAttribute("mGender", member.getGender());
		return "memberResult";
	}
}
