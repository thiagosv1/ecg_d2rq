package br.ufc.arida.ecg.service.impl;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import br.ufc.arida.ecg.service.FileStorageService;

@Service
public class FileStorageServiceImpl implements FileStorageService{
	
	
	private final Path rootLocation;

    @Autowired
    public FileStorageServiceImpl() {
    	
    	String n = new File("src/main/resources/mobile/").getAbsolutePath();
    	System.out.println(n);
        this.rootLocation = Paths.get(n);
    }

	@Override
	public void init() {
		try {
			Files.createDirectories(rootLocation);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void store(MultipartFile file) {

		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		
		System.out.println("filename"+filename);
		
		try {
			 if (file.isEmpty()) {
	           //enviar mensagem de erro
			 }
			 try (InputStream inputStream = file.getInputStream()) {
	                Files.copy(inputStream, this.rootLocation.resolve(filename),
	                    StandardCopyOption.REPLACE_EXISTING);
	            }
		} catch (Exception e) {
           System.out.println(e);
		}
		
	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path load(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource loadAsResource(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
