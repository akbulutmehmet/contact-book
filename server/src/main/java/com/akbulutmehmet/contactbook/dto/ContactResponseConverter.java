package com.akbulutmehmet.contactbook.dto;

import com.akbulutmehmet.contactbook.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactResponseConverter {


    public ContactResponse convert (Contact contact) {
        return new ContactResponse(contact.getId(), contact.getName(), contact.getSurName(), contact.getPhoneNumber());
    }
}
