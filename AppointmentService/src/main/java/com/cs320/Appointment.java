package com.cs320;
import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private String appointmentDesc;

    public Appointment(String appointmentId, Date appointmentDate, String appointmentDesc){

        if (appointmentId == null || appointmentId.length() > 10){ 
            throw new IllegalArgumentException("this is an invalid appointment ID ");
         }
         this.appointmentId = appointmentId;

         if (appointmentDate == null || appointmentDate.before(new Date())){
            throw new IllegalArgumentException("this is an invalid name ");
         }
         this.appointmentDate = appointmentDate;

         if (appointmentDesc == null || appointmentDesc.length()>50 ){
            throw new IllegalArgumentException("this is an invalid description ");
         }
         this.appointmentDesc = appointmentDesc;
    } 
      public String getAppointmentId() {
        return appointmentId;
    }

    
      public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        if (appointmentDate == null || appointmentDate.before(new Date())){
            throw new IllegalArgumentException("this is an invalid Date");
            
        }
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDesc(){
      return appointmentDesc;
    }

    public void setAppointmentDesc(String appointmentDesc){
      if (appointmentDesc == null || appointmentDesc.length() > 50 ){
            throw new IllegalArgumentException("this is an invalid description");
         }
         this.appointmentDesc = appointmentDesc;

    } 
}
