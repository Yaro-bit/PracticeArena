package com.practice.yaro.photoclone.photoclone;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PhotoService {
	private Map<String, Photo> db = new HashMap<>() {
	};

	public Collection<Photo> returnAll() {
		// TODO Auto-generated method stub
		return db.values();
	}

	public Photo get(String id) {
		return db.get(id);
	}

	public Photo remove(String id) {
		if (id == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			db.remove(id);
			throw new ResponseStatusException(HttpStatus.ACCEPTED);
		}		
	}

	public Photo put(String fileName, byte[] data) {
		Photo photo = new Photo();
		photo.setId(UUID.randomUUID().toString());
		photo.setFileName(fileName);
		photo.setData(data);
		db.put(photo.getId(), photo);
		return photo;
	}

}
