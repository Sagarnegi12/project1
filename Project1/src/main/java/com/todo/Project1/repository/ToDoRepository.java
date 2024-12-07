package com.todo.Project1.repository;



import com.todo.Project1.Model.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
}
