package com.akbulutmehmet.contactbook.service;

import com.akbulutmehmet.contactbook.dto.ContactRequest;
import com.akbulutmehmet.contactbook.dto.ContactResponse;
import com.akbulutmehmet.contactbook.dto.ContactResponseConverter;
import com.akbulutmehmet.contactbook.model.Contact;
import com.akbulutmehmet.contactbook.repository.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ContactService {
    private ContactRepository contactRepository;
    private ContactResponseConverter contactResponseConverter;

    public ContactService(ContactRepository contactRepository, ContactResponseConverter contactResponseConverter) {
        this.contactRepository = contactRepository;
        this.contactResponseConverter = contactResponseConverter;
    }

    public List<ContactResponse> getAll() {
        List<Contact> contactList = contactRepository.findAll();
        List<ContactResponse> contactResponsesList = new ArrayList<>();
        contactList.forEach((contact) -> {
            contactResponsesList.add(contactResponseConverter.convert(contact));
        });
        return contactResponsesList;
    }

    public ContactResponse create(ContactRequest contactRequest) {
       return contactResponseConverter.convert(contactRepository.save(new Contact(contactRequest.getName(),contactRequest.getSurName(),
               contactRequest.getPhoneNumber())));

    }

    public void deleteById(Long id) {
       contactRepository.deleteById(id);
    }


}
