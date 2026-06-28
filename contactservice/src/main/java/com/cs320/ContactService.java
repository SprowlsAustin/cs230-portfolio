package com.cs320;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact){
        if (contacts.containsKey(contact.getContactId())){
            throw new IllegalArgumentException("that contact already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId){
        if(!contacts.containsKey(contactId)){
            throw new IllegalArgumentException("this contact doesnt exist");
        }
        contacts.remove(contactId);
    }

    public void updateContact( String contactId, String firstName, String lastName, String phone, String address){
         if(!contacts.containsKey(contactId)){
            throw new IllegalArgumentException("this contact doesnt exist");
        }
        Contact contact = contacts.get(contactId);

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }


}

