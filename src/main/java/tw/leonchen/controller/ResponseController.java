package tw.leonchen.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {
	
	@GetMapping(path="/responsebody.controller")
	@ResponseBody
	public String processResponseBodyAction() {
		return "Have a nice day !!";
	}															//text/html == html or plain or xml 轉換文件格式  (1,2) 1=文件格式 2=編碼格式 
	@GetMapping(path="/responsebody2.controller",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String processResponseBodyAction2() {
		return "Have a nice day 你好 !!";
	}
	@GetMapping(path = "responseEntity.controller")
	public ResponseEntity<String> processResponseEntity() {
		return new ResponseEntity<String>("Custom Status Code(403 Forbidden)",HttpStatus.FORBIDDEN);
	}
	@GetMapping(path = "responseEntity2.controller")
	public ResponseEntity<String> processResponseEntity2() {
		HttpHeaders heads = new HttpHeaders();
		heads.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<String>("Custom Headers",heads,HttpStatus.OK);
	}
	@GetMapping(path = "/responseimage.controller",produces = "text/plain;charset=UTF-8")
	public void processImgeAction(HttpServletRequest request,HttpServletResponse response) throws IOException {
		InputStream in = request.getServletContext().getResourceAsStream("/WEB-INF/resources/images/my01.jpg");
		IOUtils.copy(in, response.getOutputStream());
	}
	

}
