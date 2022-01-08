package com.example.a7;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class TaskStorage {

    private static TaskStorage instance = null;
    private List<Task> tasks;

    private TaskStorage() {
        tasks = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            tasks.add(new Task(String.valueOf(i)));
        }
    }

    public static TaskStorage getInstance() {
        if(instance == null) {
            instance = new TaskStorage();
        }
        return instance;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID index) {
        for(Task t: tasks) {
            if(t.getId().equals(index)) {
                return t;
            }
        }
        return null;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

}
