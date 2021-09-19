package com.sofkau.crudtodo.services;

import com.sofkau.crudtodo.entities.Todo;

import java.util.List;

public interface InterfacesServicesTodo {
    public List<Todo> listAllTodo();
    public  Todo save(Todo todo);
    public void delete(Long id);
    public Todo getOneTodo(Long id);
}
