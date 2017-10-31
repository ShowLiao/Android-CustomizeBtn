package com.example.show.custmizinglistview;

/**
 * Created by show on 8/17/17.
 */

public class Items {
    private int id;
    private String task;
    private String duteDate;

    public Items(int id, String task, String duteDate) {
        this.id = id;
        this.task = task;
        this.duteDate = duteDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDuteDate() {
        return duteDate;
    }

    public void setDuteDate(String duteDate) {
        this.duteDate = duteDate;
    }
}
