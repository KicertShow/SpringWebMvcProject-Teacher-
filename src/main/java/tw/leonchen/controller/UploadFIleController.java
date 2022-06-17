package tw.leonchen.controller;


import java.io.File;
import java.io.IOException;

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
	public String  processAction(HttpServletRequest request ,@RequestParam("myFiles")MultipartFile mf) throws  IOException {
			String fileName = mf.getOriginalFilename();	 //取得上傳檔案的name
			
			String saveDir  = "c:/temp/upload";
			File saveFileDir = new File(saveDir);
			
			if (!saveFileDir.exists()) { //判斷存不存在
				 saveFileDir.mkdirs();  //建資料夾
			}
			String saveFilePath = saveDir +"/" +fileName;
			File saveFile = new File(saveFileDir,fileName);
//			File saveFile = new File(saveFilePath);  第二種寫法 正確 
			
			mf.transferTo(saveFile);
		return "saveFile:=" +saveFile;
	}
	
	
}
