package com.practice.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.todo.TodoRepository;

@Component
public class TodoCommandLineRunner implements CommandLineRunner{
    @Autowired
    private TodoRepository repository;
    @Override
    public void run(String... args) throws Exception {
    }
}
