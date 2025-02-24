package com.practice.yaro.photoclone.photoclone;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PhotoController {

	private Map<String, Photo> db = new HashMap<>() {
		{
			put("1", new Photo("1", "hello photo"));
		}
	};

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/photo")
	public Collection<Photo> get() {
		return db.values();
	}

	@GetMapping("/photo/{id}")
	public Photo get(@PathVariable String id) {
		Photo photo = db.get(id);
		if (photo == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			return photo;
		}
	}

	@DeleteMapping("/photo/{id}")
	public void delete(@PathVariable String id) {
		Photo photo = db.remove(id);
		if (photo == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			throw new ResponseStatusException(HttpStatus.ACCEPTED);
		}
	}

	@PostMapping("/photo")
	public Photo create(@RequestBody @Validated Photo photo) {
		photo.setId(UUID.randomUUID().toString());
		db.put(photo.getId(), photo);
		return photo;

	}
}
