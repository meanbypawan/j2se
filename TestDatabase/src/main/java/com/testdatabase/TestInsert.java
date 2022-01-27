package com.testdatabase;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Salary");
            float salary = sc.nextFloat();
            System.out.println("Enter Mobile");
            String mobile = sc.next();
            System.out.println("Enter Age");
            int age = sc.nextInt();
            int city_id = 1;
            
          con = GetConnection.getConnection();
          String sql = "insert into employee(name,salary,mobile,age,city_id)"
                  + " values('"+name+"',"+salary+",'"+mobile+"',"+age+","+city_id+")";
          Statement st = con.createStatement();
          int x = st.executeUpdate(sql);
          if(x!=0)
                System.out.println("Record Saved..");
          else
                System.out.println("Failed...");
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
    }
    
}
