package in.sterling.util;

import java.sql.*;
public class MyConnection 
{
     static Connection con=null;
     
     static
     {
         try
         {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver load");
            
         } 
         catch (Exception e) 
         {
               System.out.println(e);
         } 
         
     }
     
    public static Connection getConnection()
    {
        try
        {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uspayroll","root","root");
           System.out.println("Connection Success........");
         } 
         catch (Exception e) 
         {
             System.out.println(e); 
         }  
        return con;
    }
}