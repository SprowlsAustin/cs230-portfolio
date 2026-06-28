package com.cs320;

public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address){
         if (contactId == null || contactId.length() > 10){ 
            throw new IllegalArgumentException("this is an invalid contact ID ");
         }
         this.contactId = contactId;

         if (firstName == null || firstName.length() > 10 ){
            throw new IllegalArgumentException("this is an invalid first name");
         }
         this.firstName = firstName;

         if (lastName == null || lastName.length() > 10 ){
            throw new IllegalArgumentException("this is an invalid last name");
         }
         this.lastName = lastName;

         if (phone == null || phone.length() != 10){
            throw new IllegalArgumentException("This is an invalid phone number");
         }
         this.phone = phone;

         if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("this is an invalid address");
         }
         this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10 ){
            throw new IllegalArgumentException("this is an invalid first name");
            
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
         if (lastName == null || lastName.length() > 10 ){
            throw new IllegalArgumentException("this is an invalid last name");
         }
         this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
         if (phone == null || phone.length() != 10){
            throw new IllegalArgumentException("This is an invalid phone number");
         }
         this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
         if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("this is an invalid address");
         }
         this.address = address;
    }

    

}

