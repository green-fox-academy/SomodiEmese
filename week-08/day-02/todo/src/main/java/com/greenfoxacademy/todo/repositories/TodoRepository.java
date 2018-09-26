package com.greenfoxacademy.todo.repositories;

import com.greenfoxacademy.todo.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
