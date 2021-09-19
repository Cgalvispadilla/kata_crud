package com.sofkau.crudtodo.services;

import com.sofkau.crudtodo.entities.Todo;
import com.sofkau.crudtodo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.directory.InvalidAttributesException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TodoService implements InterfacesServicesTodo{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> listAllTodo() {
        return  todoRepository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void delete(Long id) {
        todoRepository.delete(getOneTodo(id));
    }

    @Override
    public Todo getOneTodo(Long id) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if(optionalTodo.isEmpty()){
            throw  new NoSuchElementException("no existe ningun todo con el id ingresado");
        }
        return optionalTodo.get();
    }
}
