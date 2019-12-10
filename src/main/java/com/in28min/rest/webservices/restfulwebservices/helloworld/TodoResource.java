package com.in28min.rest.webservices.restfulwebservices.helloworld;

import com.in28min.rest.webservices.restfulwebservices.helloworld.todo.ToDoHardCodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoResource {
    @Autowired
    ToDoHardCodedService toDoHardCodedService;

    @GetMapping(path = "/users/{username}/todos")
    List<Todo> getAllTodos(@PathVariable String username){
        return toDoHardCodedService.findAll();
    }

    @DeleteMapping(path = "/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        Todo todo = toDoHardCodedService.deleteById(id);

        if (todo != null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }


}
