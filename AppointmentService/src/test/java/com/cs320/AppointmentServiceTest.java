package com.cs320;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
    @Test
    public void createAppointment(){
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description for Austin");
        service.addAppointment(appointment);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        service.addAppointment(appointment);
        });
    }

    @Test
    public void deleteappointment(){
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("123456789", new Date(System.currentTimeMillis() + 86400000), "description for Austin");
        service.addAppointment(appointment);
        service.deleteAppointment("123456789");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("123456789");
        });
    }
   
}
