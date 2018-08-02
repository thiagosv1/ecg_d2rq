package br.ufc.arida.ecg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ufc.arida.ecg.service.FileStorageService;

@RestController
@RequestMapping(value = "/files")
public class FileController {
	
	@Autowired
	public FileStorageService fileStorageService;
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String handleFileUpload(@RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes) {
		
		
		fileStorageService.store(file);
		
		return "deu certo";
	}
	

}
