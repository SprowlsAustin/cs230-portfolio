package com.cs320;
import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments = new HashMap<>();

    public void addAppointment(Appointment appointment){
        if (appointments.containsKey(appointment.getAppointmentId())){
            throw new IllegalArgumentException("appointment already exists");
        }
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    public void deleteAppointment(String appointmentId){
        if(!appointments.containsKey(appointmentId)){
            throw new IllegalArgumentException("this contact doesnt exist");
        }
        appointments.remove(appointmentId);
    }
}
