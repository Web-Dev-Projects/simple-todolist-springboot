package com.springboot.todolist.model;

import java.util.Date;

import javax.validation.constraints.Size;

public class Todo {
    private Integer id;
    private String user;
    @Size(min = 3, message = "Min length is 3 chars") 
    private String description;
    private Date targetDate;
    private boolean isDone;

    public Todo() {
        super();
    }

    public Todo(Integer id, String user, String description, Date targetDate, boolean isDone) {
        super();
        this.init(id, user, description, targetDate, isDone);
	}

    public void init(Integer id, String user, String description, Date targetDate, boolean isDone) {
		this.id = id;
		this.user = user;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id == "" ? 0:Integer.parseInt(id);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", description='" + getDescription() + "'" +
            ", targetDate='" + getTargetDate() + "'" +
            ", isDone='" + getIsDone() + "'" +
            "}";
    }
}
