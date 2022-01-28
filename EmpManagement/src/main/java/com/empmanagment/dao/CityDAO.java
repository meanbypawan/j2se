package com.empmanagment.dao;

import com.empmanagement.model.City;
import com.empmanagement.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CityDAO {
  public static ArrayList<City> getCityList(){
      Connection con = null;
      ArrayList<City>al = new ArrayList<>();
      try{
          con = GetConnection.getConnection();
          String sql = "select * from city";
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              int id = rs.getInt(1);
              String name = rs.getString(2);
              City city = new City(id, name);
              al.add(city);
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
}
