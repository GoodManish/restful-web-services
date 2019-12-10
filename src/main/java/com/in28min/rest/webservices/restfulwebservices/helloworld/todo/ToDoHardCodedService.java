package com.in28min.rest.webservices.restfulwebservices.helloworld.todo;

import com.in28min.rest.webservices.restfulwebservices.helloworld.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ToDoHardCodedService {
    private static List<Todo> todos = new ArrayList();
    private static int idCounter=0;

    static {
        todos.add(new Todo(++idCounter, "In28Minutes", "Learn Angular", new Date(), false ));
        todos.add(new Todo(++idCounter, "In28Minutes", "Become Expert in angular", new Date(), false ));
        todos.add(new Todo(++idCounter, "In28Minutes", "solve a code everyday", new Date(), false ));
        todos.add(new Todo(++idCounter, "In28Minutes", "Become better programmer", new Date(), false ));
    }

    public List<Todo> findAll(){
        return todos;
    }

}
