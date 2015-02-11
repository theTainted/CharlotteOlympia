package com.CO;

import java.sql.*;
public class damnMe {
 
    public static void main(String[] args) {
          
        try{
             
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                
           
                 
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=C:\\new.xls;";
                 Connection conn = DriverManager.getConnection(myDB, "", "");
                   Statement st=conn.createStatement();
                    
                   ResultSet rs = st.executeQuery("select  * from [Sheet1$]");
                 
                   System.out.println(rs);
                     
                    }
        catch(Exception e){
        System.out.println(e);
        }
         
         
    }
 
}
