package com.todo.Project1.repository;

import com.todo.Project1.Model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepository {
    private List<ToDo> tasks = new ArrayList<>();
    private int idCounter = 1;

    public List<ToDo> findAll() {
        return tasks;
    }

    public ToDo save(ToDo task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }

    public void deleteById(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public ToDo update(ToDo task) {
        for (ToDo existing : tasks) {
            if (existing.getId() == task.getId()) {
                existing.setTask(task.getTask());
                existing.setCompleted(task.isCompleted());
                return existing;
            }
        }
        return null;
    }
}
