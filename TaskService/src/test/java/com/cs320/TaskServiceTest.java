package com.cs320;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {

      @Test
    public void createTask(){
        TaskService service = new TaskService();
        Task task = new Task("123456789", "Austin Sprowls", "description for Austin");
        service.addTask(task);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        service.addTask(task);
        });
    }

    @Test
    public void deleteTask(){
        TaskService service = new TaskService();
        Task task = new Task("123456789", "Austin Sprowls", "description for Austin");
        service.addTask(task);
        service.deleteTask("123456789");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.deleteTask("123456789");
        });
    }

    @Test
    public void updateTaskTest(){
         TaskService service = new TaskService();
        Task task = new Task("123456789", "Austin Sprowls", "description for Austin");
        service.addTask(task);
        service.updateTask("123456789", "John Sprowls", "description for Austin");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.updateTask("000000000","John Sprowls", "description for Austin");
        });
    }
    
}
