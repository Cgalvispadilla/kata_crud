package com.sofkau.crudtodo.repositories;

import com.sofkau.crudtodo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
