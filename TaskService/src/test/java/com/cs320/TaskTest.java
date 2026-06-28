package com.cs320;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task("1234567890", "Austin", "12345678910");
    Assertions.assertNotNull(task);
    }
    
    @Test
    public void testTaskIdNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task(null, "Austin", "Sprowls");
        });

    }

    @Test
    public void testTaskIdLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task("1234567891011", "Austin", "Sprowls");
        });

    }

    @Test
    public void testNameNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task("123456789", null, "12345678910");
        });

    }

    @Test
    public void testNameLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task("123456789", "Austin Sprowls long name 123", "12345678910");
        });
    }
        @Test
    public void testDescriptionNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task("123456789", "Austin", null);
        });

    }

    @Test
    public void testDescriptionLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Task("123456789", "Austin", "12345678910111213141516171819202122232425262728293031323334353637383940");
        });
        }
    }




