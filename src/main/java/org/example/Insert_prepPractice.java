package org.example;

import java.sql.*;
public class Insert_prepPractice {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String durl = "jdbc:mysql://localhost:3306/classicmodels";
        String user= "teamlead";
        String password = "teamlead_password";
        try{
            con = DriverManager.getConnection(durl,user,password);
            System.out.println("Connection established successfully!");
            String sqlQuery = "INSERT INTO EMPLOYEES(employeeNumber, lastName, firstName, extension, email,officeCode,jobTitle)  VALUES (?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sqlQuery)  ;
            prepStmt.setInt(1,0001);
            prepStmt.setString(2,"Johar");
            prepStmt.setString(3,"Hasib");
            prepStmt.setInt(4,1818);
            prepStmt.setString(5,"johar@yahoo.com");
            prepStmt.setInt(6,1);
            prepStmt.setString(7,"CEO");

            int affectedRows = prepStmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");
            prepStmt = con.prepareStatement("select * from employees where employeeNumber = ? ");
            prepStmt.setInt(1, 0003);
            rs = prepStmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));


            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            prepStmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
