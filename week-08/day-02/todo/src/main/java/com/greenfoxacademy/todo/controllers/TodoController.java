package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("/todo")
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());

        return "todolist";
    }

    @RequestMapping("/todo/list")
    public String list(Model model, @RequestParam("isActive") Boolean done) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("done", done);

        return "activeList";
    }

    @GetMapping("/todo/add")
    public String createTask(Model model) {

        return "form";
    }

    @PostMapping("/todo/add")
    public String sendTask(@RequestParam("todo") String todo) {

        if(todo.isEmpty()){
            return "form";
        }
        Todo newTodo= new Todo();
        newTodo.setTitle(todo);
        todoRepository.save(newTodo);

        return "redirect:/todo";

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id){

        todoRepository.deleteById(id);

        return "redirect:/todo";
    }

    @GetMapping(value ="/todo/{id}/edit")
    public String update(@PathVariable long id, Model model){
        Optional<Todo> optional = todoRepository.findById(id);
        if(!optional.isPresent()){
            return "redirect:/todo";

        }
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("todo", optional.get());
        model.addAttribute("id", todo.getId());
        model.addAttribute("title", todo.getTitle());
        model.addAttribute("urgent", todo.isUrgent());
        model.addAttribute("done", todo.isDone());
        return "edit";
    }

    @PostMapping("/todo/{id}/edit")
    public String getUpdate(@PathVariable long id, boolean done, boolean urgent, String title){
        Todo todo = todoRepository.findById(id).get();

        todo.setTitle(title);
        todo.setUrgent(urgent);
        todo.setDone(done);
        todoRepository.save(todo);

        return "redirect:/todo";
    }
}
