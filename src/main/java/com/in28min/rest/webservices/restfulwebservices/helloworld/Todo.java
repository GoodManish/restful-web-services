package com.in28min.rest.webservices.restfulwebservices.helloworld;

import java.util.Date;

public class Todo {
    private long id;
    private String userName;
    private String description;
    private Date targetDate;
    private boolean isDone;

    public Todo(long id, String userName, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
