package com.empmanagment.dao;
import com.empmanagement.model.Admin;
import com.empmanagement.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AdminDAO {
  public static boolean authenticate(Admin admin){
      boolean status = false;
      Connection con = null;
      try{
          con = GetConnection.getConnection();
          String sql = "select * from admin where email=? and password=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, admin.getEmail());
          ps.setString(2, admin.getPassword());
          
          ResultSet rs = ps.executeQuery();
          if(rs.next())
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
