package com.cs320;

public class Task {

    private String taskId;
    private String name;
    private String description;

    public Task(String taskId, String name, String description){

        if (taskId == null || taskId.length() > 10){ 
            throw new IllegalArgumentException("this is an invalid contact ID ");
         }
         this.taskId = taskId;

         if (name == null || name.length() > 20){
            throw new IllegalArgumentException("this is an invalid name ");
         }
         this.name = name;

         if (description == null || description.length()>50 ){
            throw new IllegalArgumentException("this is an invalid description ");
         }
         this.description = description;


    }
    
     public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() > 20 ){
            throw new IllegalArgumentException("this is an invalid name");
            
        }
        this.name = name;
    }

    public String getDescription(){
      return description;
    }

    public void setDescrption(String description){
      if (description == null || description.length() > 50 ){
            throw new IllegalArgumentException("this is an invalid description");
         }
         this.description = description;

    }   
}
