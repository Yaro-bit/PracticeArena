package com.yaro.d2d.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.yaro.d2d.repository.Adr;

import jakarta.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AdrController {

    private Map<String, Adr> db = new HashMap<>() {
        {
            put("1", new Adr("1", "1st Example Street", "Linz", "4020"));
        }
    }; // quick and dirty

    // Fetch all addresses
    @GetMapping("/adr")
    public Collection<Adr> getAdr() {
        return db.values();
    }

    // Fetch a specific address by ID
    @GetMapping("/adr/{id}")
    public Adr getAdr(@PathVariable String id) {
        Adr adr = db.get(id);
        if (adr == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return adr;
    }

    // Delete an address by ID
    @DeleteMapping("/adr/{id}")
    public void deleteAdr(@PathVariable String id) {
        Adr adr = db.remove(id);
        if (adr == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    // Create a new address and store it
   @PostMapping("/adr/")
    public Adr createAdr(@RequestBody @Valid Adr adr) {
       adr.setId(UUID.randomUUID().toString());
       if (db.containsKey(adr.getId())) {
           throw new IllegalStateException("Eintrag mit dieser ID existiert bereits.");
       }
       db.put(adr.getId(), adr);
       return adr;
   }
    
}
