package com.todo.Project1.Service;

import com.todo.Project1.Model.ToDo;
import com.todo.Project1.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository repository;

    public List<ToDo> getAllTasks() {
        return repository.findAll();
    }

    public ToDo addTask(ToDo task) {
        return repository.save(task);
    }

    public void deleteTask(int id) {
        repository.deleteById(id);
    }

    public ToDo updateTask(ToDo task) {
        return repository.update(task);
    }
}
