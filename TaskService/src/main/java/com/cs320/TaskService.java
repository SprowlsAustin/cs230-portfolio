package com.cs320;

import java.util.HashMap;
import java.util.Map;

public class TaskService {

    private Map<String, Task> tasks = new HashMap<>();

    public void addTask(Task task){
        if (tasks.containsKey(task.getTaskId())){
            throw new IllegalArgumentException("Task already exists");
        }
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId){
        if(!tasks.containsKey(taskId)){
            throw new IllegalArgumentException("this contact doesnt exist");
        }
        tasks.remove(taskId);
    }

    public void updateTask( String taskId, String name, String descrption){
         if(!tasks.containsKey(taskId)){
            throw new IllegalArgumentException("this contact doesnt exist");
        }
        Task task = tasks.get(taskId);

        task.setName(name);
        task.setDescrption(descrption);
    }


}

