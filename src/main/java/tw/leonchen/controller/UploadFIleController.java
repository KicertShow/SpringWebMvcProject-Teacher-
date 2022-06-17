package tw.leonchen.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFIleController {
	@GetMapping(path = "/uploadfile.controller")
	public String processMainAction() {
		return "uploadFile";
	}
	
	
	@PostMapping("uploadfile.controller")
	@ResponseBody
	public String  processAction(HttpServletRequest request ,@RequestParam("myFiles")MultipartFile mf) {
			String fileName = mf.getOriginalFilename();	
		return "fileName:=" +fileName;
	}
	
}
