package com.springboot.todolist.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import com.springboot.todolist.model.Todo;
import com.springboot.todolist.service.TodosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodosController {
    @Autowired
    TodosService todosService;

    @InitBinder
    void InitBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd/mm/yyyy"), false));
    }

    @GetMapping(value = "/todo-list")
    public String getTodoList(ModelMap modelMap) throws Exception {
        modelMap.put("todos", this.todosService.getTodos());
        return "todo-list";
    }

    @GetMapping(value = "/todo")
    public String getTodoPage(ModelMap modelMap) {
        if (!modelMap.containsAttribute("todo")) {
            modelMap.put("todo", new Todo());
        }
        return "todo";
    }

    @PostMapping(path = "/todo")
    public String addTodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult result, ModelMap modelMap) {
        if (result.hasErrors()) {
            return "todo";
        }

        todo.setUser((String) modelMap.get("username"));
        if (Objects.isNull(todo.getId())) {
            this.todosService.addTodo(todo);
        } else {
            this.todosService.updateTodo(todo);
        }
        return "redirect:/todo-list";
    }

    @GetMapping(path = "/update-todo")
    public String getUpdateTodoPage(@RequestParam int id, ModelMap modelMap) {
        Optional<Todo> optionalTodo = todosService.getTodo(id);
        if (optionalTodo.isPresent()) {
            modelMap.put("todo", optionalTodo.get());
        }   
        return "todo";
    }

    @GetMapping(path = "/delete-todo")
    public String deleteTodo(@RequestParam int id) {
        this.todosService.removeTodo(id);
        return "redirect:/todo-list";
    }

}
