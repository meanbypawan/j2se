package com.mycompany.testcollection;

public class User implements Comparable<User>{
  private int id;
  private String name;
  private int age;
  private float height;

    public User(int id, String name, int age, float height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+height; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(User o) {
      return this.id - o.id;
    }
   
}
