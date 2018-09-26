package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

   @Override
    public void run (String...args) throws Exception{

       Todo todo = new Todo();
       todo.setTitle("I have to learn Object Relational Mapping");
       Todo todo2 = new Todo();
       todo2.setTitle("Buy milk");
       todo2.setDone(true);
       Todo todo3 = new Todo();
       todo3.setTitle("Netflix and chill");
       Todo todo4 = new Todo();
       todo4.setTitle("Buy Unicorn");


       todoRepository.save(todo);
       todoRepository.save(todo2);
       todoRepository.save(todo3);
       todoRepository.save(todo4);
       System.out.println(todoRepository.findAll());

    }
}
