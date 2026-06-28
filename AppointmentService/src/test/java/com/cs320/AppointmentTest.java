package com.cs320;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AppointmentTest {


    @Test
    public void testAppointmentCreation() {
        Appointment appointment = new Appointment("1234567890", new Date(System.currentTimeMillis() + 86400000), "Description for Appointment Here");
    Assertions.assertNotNull(appointment);
    }
    
    @Test
    public void testAppointmentIdNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment(null, new Date(System.currentTimeMillis() + 86400000) , "Description for appointmet here");
        });

    }

    @Test
    public void testAppointmentIdLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment("1234567891011",new Date(System.currentTimeMillis() + 86400000), "Sprowls");
        });

    }

    @Test
    public void testAppointmentDateNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment("123456789", null, "12345678910");
        });

    }

    @Test
    public void testAppointmentDatePast(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment("123456789", new Date(0), "12345678910");
        });
    }
        @Test
    public void testDescriptionNUll(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment("123456789",new Date(System.currentTimeMillis() + 86400000), null);
        });

    }

    @Test
    public void testDescriptionLong(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
        new Appointment("123456789",new Date(System.currentTimeMillis() + 86400000), "12345678910111213141516171819202122232425262728293031323334353637383940");
        });
        }

    @Test
    public void testSetAppointmentDatePast(){
    Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description");
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    appointment.setAppointmentDate(new Date(0)); 
    });
    }

     @Test
    public void testSetAppointmentDateNull(){
    Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description");
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    appointment.setAppointmentDate(null); 
    });
    }
     @Test
    public void testSetAppointmentDescNull(){
    Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description");
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    appointment.setAppointmentDesc(null);
    });
    }

    @Test
    public void testSetAppointmentDescLong(){
    Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description");
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    appointment.setAppointmentDesc("This is a really long description for test set appointment description thats too long");
    });
    }

}
    

