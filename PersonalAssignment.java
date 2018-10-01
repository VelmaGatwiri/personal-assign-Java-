/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalassignment;
import java.sql.*;
/**
 *
 * @author velma
 */
public class PersonalAssignment {
     private static final String Username="root";
     private static final String Password="";
     private static final String CONN_STRING="jdbc:mysql://localhost:3306/assignment";

    public static void main(String[] args) {
            Connection conn = null;
        try{
            conn=DriverManager.getConnection(CONN_STRING,Username,Password);
            System.out.println("CONNECTED!");
            
            Statement st=conn.createStatement();
            
            //String query1="INSERT INTO LOGI"
        }
        catch(SQLException e){
            System.err.println(e);
        }
                   
        }

    boolean checkLogin(String text, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

