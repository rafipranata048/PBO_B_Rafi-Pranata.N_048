package com.praktikum.users;

public abstract class User {
    protected String name;
    protected String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract boolean login(String username, String password);
    public abstract void displayInfo();
    public abstract void displayAppMenu();
}
