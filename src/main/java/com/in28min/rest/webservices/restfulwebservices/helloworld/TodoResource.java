package com.in28min.rest.webservices.restfulwebservices.helloworld;

import com.in28min.rest.webservices.restfulwebservices.helloworld.todo.ToDoHardCodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {
    @Autowired
    ToDoHardCodedService toDoHardCodedService;

    @GetMapping(path = "/users/{username}/todos")
    List<Todo> getAllTodos(@PathVariable String username){
        return toDoHardCodedService.findAll();
    }
}
