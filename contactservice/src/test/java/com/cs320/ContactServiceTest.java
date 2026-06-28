package com.cs320;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ContactServiceTest {
    
    @Test
    public void createContact(){
        ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "Austin", "Sprowls", "1234567890", "123 Main St");
        service.addContact(contact);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        service.addContact(contact);
        });
    }

    @Test
    public void deleteContact(){
        ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "Austin", "Sprowls", "1234567890", "123 Main St");
        service.addContact(contact);
        service.deleteContact("1234567890");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("1234567890");
        });
    }

    @Test
    public void updateContactTest(){
         ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "Austin", "Sprowls", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateContact("1234567890", "john", "Sprowls", "1234567890", "123 main street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.updateContact("0000000000", "john", "Sprowls", "1234567890", "123 main street");
        });
    }
    
}
