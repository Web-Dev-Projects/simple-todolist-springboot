package com.springboot.todolist.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import com.springboot.todolist.model.Todo;

import org.springframework.stereotype.Component;

@Component
public class TodosService {
    private static ArrayList<Todo> todos = new ArrayList<>();
    private static int nextTodoId = 3;
    static {
        todos.add(new Todo(0,"shehab", "Learning spring boot", new Date(), false));
        todos.add(new Todo(1,"shehab", "Learning hibernate", new Date(), false));
        todos.add(new Todo(2,"shehab", "Learning spring microservices", new Date(), false));
    }

    public TodosService() {
        super();
    }

    public ArrayList<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todo.setId(nextTodoId++);
        todos.add(todo);
    }

    public void removeTodo(Integer todoId) {
        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId().equals(todoId)){
                todos.remove(i);
                break;
            }
        }
    }
    
    public Optional<Todo> getTodo(Integer todoId) {
        return todos
        .stream()
        .filter(todo -> todo.getId().equals(todoId))
        .findFirst();
    }

    public boolean updateTodo(Todo todo) {
        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId().equals(todo.getId())){
                todos.set(i, todo);
                return true;
            }
        }
        return false;
    }
    
}
