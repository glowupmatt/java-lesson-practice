package com.practice.practice.todo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/todo")
public class TodoRoutes {
    @Autowired
    private TodoRepository repository;

    @PostConstruct
    private void initializeTodos() {
        repository.save(new Todo("finish app", "this is a reminder to finish app"));
        repository.save(new Todo("Make Memes", "this is a reminder to make memes"));
        repository.save(new Todo("go to sleep", "this is a reminder to go to sleep"));
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return repository.save(todo);
    }
}