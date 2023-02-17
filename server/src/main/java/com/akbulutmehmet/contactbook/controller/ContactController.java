package com.akbulutmehmet.contactbook.controller;

import com.akbulutmehmet.contactbook.dto.ContactRequest;
import com.akbulutmehmet.contactbook.dto.ContactResponse;
import com.akbulutmehmet.contactbook.model.Contact;
import com.akbulutmehmet.contactbook.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/contact")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("getAll")
    public ResponseEntity<List<ContactResponse>> getAll () {
        return ResponseEntity.ok(contactService.getAll());
    }

    @PostMapping(value = "create")
    public ResponseEntity<ContactResponse> create (@Valid @RequestBody ContactRequest contactRequest) {
        return ResponseEntity.ok(contactService.create(contactRequest));
    }
    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
         contactService.deleteById(id);
    }

    
}
