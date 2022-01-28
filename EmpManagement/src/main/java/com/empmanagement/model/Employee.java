package com.empmanagement.model;

public class Employee {
  private Integer id;
  private String name;
  private String mobile;
  private Integer age;
  private Integer salary;
  private String experience;
  private Integer cityId;
  private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
  
    public Employee(Integer id, String name, String mobile, Integer age, Integer salary, String experience, Integer cityId) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.cityId = cityId;
    }

    public Employee(String name, String mobile, Integer age, Integer salary, String experience, Integer cityId) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.cityId = cityId;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
  
}
