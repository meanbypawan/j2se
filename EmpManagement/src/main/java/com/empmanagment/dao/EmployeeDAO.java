package com.empmanagment.dao;

import com.empmanagement.model.City;
import com.empmanagement.model.Employee;
import com.empmanagement.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDAO {
 public static ArrayList<Employee> getEmployeeList(){
     ArrayList<Employee> al = new ArrayList<>();
     Connection con = null;
     try{
         con = GetConnection.getConnection();
         String sql = "select employee.id,employee.name,employee.mobile,employee.age,employee.salary,employee.experience,employee.city_id,city.city_name from employee inner join city on employee.city_id = city.id";
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
           int id = rs.getInt(1);
           String name = rs.getString(2);
           String mobile = rs.getString(3);
           int age=  rs.getInt(4);
           int salary = rs.getInt(5);
           String experience = rs.getString(6);
           int cid = rs.getInt(7);
           String cityName = rs.getString(8);
           Employee e = new Employee(id, name, mobile, age, salary, experience, cid);
           City city = new City(cid, cityName);
           e.setCity(city);
           al.add(e);  
         }
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         try{
             con.close();
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
     return al;
 }   
 public static boolean save(Employee employee){
   boolean status = false;
     Connection con = null;
     try{
       con = GetConnection.getConnection();
       String sql = "insert into employee(name,mobile,age,salary,experience,city_id) values(?,?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, employee.getName());
         ps.setString(2, employee.getMobile());
         ps.setInt(3, employee.getAge());
         ps.setInt(4, employee.getSalary());
         ps.setString(5, employee.getExperience());
         ps.setInt(6, employee.getCityId());
         if(ps.executeUpdate()!=0)
             status = true;
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         try{
             con.close();
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
   return status;
 }    
}
