package com.tutorial.web.data;

import java.io.Serializable;

public class Tutorial implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String tutname;
    private String description;
    private String url;


    public Tutorial() {
    }

    public Tutorial(int id, String name, String tutname, String description, String url) {
        this.id = id;
        this.name = name;
        this.tutname = tutname;
        this.description = description;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutname() {
        return tutname;
    }

    public void setTutname(String tutname) {
        this.tutname = tutname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
