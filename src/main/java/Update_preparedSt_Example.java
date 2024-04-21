import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class Update_preparedSt_Example {
    public static void main(String[] args) {
        //Step 1. Create variable type Connection
        Connection con = null;

        //Step 2. Create variable type PreparedStatement to run your queries
        /*

        A PreparedStatement in Java is a precompiled SQL statement that can be used
        to execute parameterized queries against a database. It's a subclass of Statement
        and provides several advantages over regular Statement objects,
        including improved performance and security.
         */
        PreparedStatement prepStmt = null;

        /*
        In Java, for example, a ResultSet object is part of the JDBC
        (Java Database Connectivity) API and is used to fetch data from a
        database after executing a query. It provides methods to iterate over the rows of
        the result set and retrieve column values.
         */
        ResultSet rs = null;

        //Step 3. SETUP the authorization
        String durl = "jdbc:mysql://localhost:3306/classicmodels";
        String user= "teamlead";
        String password = "teamlead_password";;
                    try {
                        con = DriverManager.getConnection(durl, user, password);
                        System.out.println("Connection established successfully!");
                        String sql = "update employees set firstName=? , lastName=? where employeeNumber = ?";
                        prepStmt = con.prepareStatement(sql);
                        prepStmt.setString(1, "Gary");
                        prepStmt.setString(2, "Larson");
                        prepStmt.setLong (3, 0003);
                        int rowsAffected = prepStmt.executeUpdate();
                        prepStmt = con.prepareStatement("select * from employees where employeeNumber=?");
                        prepStmt.setInt(1, 1401);
                        //execute select query
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
                    }
            }

