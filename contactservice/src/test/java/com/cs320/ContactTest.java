package com.cs320;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("1234567890", "Austin", "Sprowls", "1234567890", "123 main st");
    Assertions.assertNotNull(contact);
    }

    @Test
    public void testContactIdNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact(null, "Austin", "Sprowls", "1234567890", "123 Main St");
        });

    }

    @Test
    public void testContactIdLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567891011", "Austin", "Sprowls", "1234567890", "123 Main St");
        });

    }

    @Test
    public void nullFirstName(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("12345678910", null, "Sprowls", "1234567890", "123 Main St");
        });

    }

    @Test
    public void longFirstName(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("12345678910", "AustinSprowls", "Sprowls", "1234567890", "123 Main St");
        });

    }

     @Test
    public void nullLastName(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", null, "1234567890", "123 Main St");
        });
    }

     @Test
    public void longLastName(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", "SprowlsAustin", "1234567890", "123 Main St");
        });
    }

     @Test
    public void nullPhone(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", "Sprowls", null, "123 Main St");
        });
    }
    @Test
    public void wrongPhoneLength(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", "Sprowls", "123456", "123 Main St");
        });
    }

    @Test
    public void nullAddress(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", "Sprowls", "1234567890", null);
        });
    }
    
    @Test
    public void LongAddress(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Contact("1234567890", "Austin", "Sprowls", "1234567890", "abcdefghijklmnopqrstuvwxyz12345");
        });
    }
}
