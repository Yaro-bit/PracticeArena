package com.practice.yaro.photoclone.photoclone;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PhotoController {

	private PhotoService photoService;

	public PhotoController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}

	@GetMapping("/")
	public String hello() {
		return "Your App ist running - this is firs page \n "
				+ "additional api on: \n"
				+ "http://localhost:8080/photo - All Photos \n "
				+ "http://localhost:8080/springboot_ref3_upload.html - Upload Photo";
	}

	@GetMapping("/photo")
	public Collection<Photo> get() {
		return photoService.returnAll();
	}

	@GetMapping("/photo/{id}")
	public Photo get(@PathVariable String id) {
		Photo photo = photoService.get(id);
		if (photo == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			return photo;
		}
	}

	@DeleteMapping("/photo/{id}")
	public void delete(@PathVariable String id) {
		Photo photo = photoService.remove(id);

	}

	@PostMapping("/photo")
	public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
		Photo photo = photoService.put(file.getOriginalFilename(), file.getBytes());
		return photo;

	}
	
	
	
}
