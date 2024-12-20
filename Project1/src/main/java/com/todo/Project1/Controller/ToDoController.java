package com.todo.Project1.Controller;

import com.todo.Project1.Model.ToDo;
import com.todo.Project1.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {
    @Autowired
    private ToDoService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", service.getAllTasks());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String task) {
        service.addTask(new ToDo(0, task, false));
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        service.deleteTask(id);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable int id, @RequestParam boolean completed) {
        ToDo task = new ToDo(id, null, completed);
        service.updateTask(task);
        return "redirect:/";
    }
}
